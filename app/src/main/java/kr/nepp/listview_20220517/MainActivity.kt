package kr.nepp.listview_20220517

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.nepp.listview_20220517.adapters.StudentAdapter
import kr.nepp.listview_20220517.datas.StudentData

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<StudentData>()

    lateinit var mAdapter : StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add(  StudentData( "김철수", 1999, "서울시 종로구" )  )
        mStudentList.add(  StudentData( "이영희", 2000, "서울시 중구" )  )
        mStudentList.add(  StudentData( "조경진", 1988, "서울시 동대문구" )  )
        mStudentList.add(  StudentData( "이름1", 1977, "서울시 서대문구" )  )
        mStudentList.add(  StudentData( "이름2", 1979, "서울시 동작구" )  )
        mStudentList.add(  StudentData( "이름3", 1985, "서울시 관악구" )  )
        mStudentList.add(  StudentData( "이름4", 1995, "서울시 은평구" )  )
        mStudentList.add(  StudentData( "이름5", 1994, "서울시 양천구" )  )
        mStudentList.add(  StudentData( "이름6", 1992, "서울시 중랑구" )  )
        mStudentList.add(  StudentData( "이름7", 1993, "서울시 강북구" )  )
        mStudentList.add(  StudentData( "이름8", 1991, "서울시 성동구" )  )


        mAdapter = StudentAdapter( this, R.layout.student_list_item, mStudentList )

        studentListView.adapter = mAdapter



    }
}