package kr.nepp.listview_20220517.datas

class StudentData(
    val name: String,
    val birthYear: Int,
    val address: String) {

//    이 학생의 나이를 계산하는 함수.

    fun getKoreanAge() : Int {

        return  2022 - this.birthYear + 1

    }

}