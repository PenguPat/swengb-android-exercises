package at.fh.swengb.loggingviewsandactivity

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_lesson_rating2.*

class LessonRatingActivity : AppCompatActivity() {
    var lessonName : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson_rating2)

        val lessonId = intent.getStringExtra(LessonListActivity.EXTRA_LESSON_ID)

        if (lessonId == null) {
            finish()
        } else {
            LessonRepository.lessonById(
                id = lessonId,
                success = {
                   lesson_rating_header.text = it.name
                    lessonName = it.name
                },
                error = {
                    Log.e("Error", it)
                })

            rate_lesson.setOnClickListener{
                val myRating = lesson_rating_bar.rating.toDouble()
                val myFeedback = lesson_feedback.text.toString()

                val lessonRating = LessonRating(myRating,myFeedback)

                LessonRepository.rateLesson(lessonId, lessonRating)

                setResult(Activity.RESULT_OK)
                finish()
             }
        }

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }
    inline fun consume(f: () -> Unit): Boolean {
        f()
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return when(item?.itemId) {
            R.id.logout -> consume { Toast.makeText(this, getString(R.string.Logout), Toast.LENGTH_SHORT).show() }
            R.id.share -> consume { Toast.makeText(this, "@string/Share", Toast.LENGTH_SHORT).show() }
            R.id.share -> consume { Toast.makeText(this, "@string/Start", Toast.LENGTH_SHORT).show() }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
