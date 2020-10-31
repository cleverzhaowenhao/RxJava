package com.example.rxjava

import io.reactivex.Observable
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

fun main1() {
    var float = 1.247915
    var int = 968741027459812868
    var char = 2
    var byte = 1
    var double = 139.24
    var long = 96874102745981286
    val list = LinkedList<TestModel>()
    var list2 = ArrayList<Int>()
    var studentList = LinkedList<Student>()
    val switcher: Observable<TestModel> = Observable.just(TestModel("123", "Trump"))
    switcher
        .subscribe {
            list.add(TestModel("9527", "Trump"))
            System.out.println(it)
            println(list)
        }
    val haha = testString()
    list2.add(1)
    val micheal = Student(16, 8, "男", 80)
    micheal.play()
    println("does he go to school? ${micheal.goToSchool()}")
    micheal.study("whatever", true)
    studentList.add(Student(21, 1, "女", 100))
    studentList.add(Student(23, 2, "男", 90))
    studentList[0].study("2", false)
    val me = studentList[1]
    me.run {
        setAlone()
        fromWhere()
        whatShouldDo()
        whereToGo()
    }


}

private fun testString(): String {
    var string1 = ""
    val string2 = ""
    return string1 + string2
}

data class TestModel(
    val id: String,
    val shop_name: String
)

class Student(var age: Int, var grade: Int, var gender: String, var score: Int):ThinkingAboutLife {

    fun play() {
        if (age >= 18) {
            println("Playing LOL")
        } else {
            println("Watching TV")
        }
    }

    fun goToSchool(): Boolean {
        return score >= 60
    }

    fun study(place: String, alone: Boolean = true) {
        if (alone && gender == "男") {
            println("He is studying at home")
        } else if (alone && gender == "女") {
            println("She is studying at library")
        }
    }

     fun setAlone(): Boolean {
        work1.type = "程序员"
        work1.timeSize =12
        work1.showWorkInfo()
        return age >= 18
    }

    private val work1 = Work()

    inner class Work() {
        var type: String = ""
        var timeSize: Int = 0
        fun showWorkInfo() {
            println("type is $type")
            println("working for $timeSize a day!")
        }
    }

    override fun fromWhere() {
        val string = "Why i am here, who brought me to this world. Did i come for no reason?"
        println(string)
    }

    override fun whereToGo() {
        println("I don't know about the final destination, i only know i would disappear in the end and one will remember me!")
    }

    override fun whatShouldDo() {
        println("I should behave like an animal, to support living, to pass my gene, to do whatever to keep the story going and lead it to a bright future!")
    }

    interface SocialActivity {
        fun goHiking()
        fun makeFriends()
        fun tellStory()
    }
}

class Teacher : Student.SocialActivity {

    private val isMathTeacher = false

    override fun goHiking() {
        println("A teacher does not go hiking")
    }

    override fun makeFriends() {
        println("A teacher does not have friends and unlike to make friends")
    }

    override fun tellStory() {
        println("they are fake stories!")
    }

}

fun main() {
    val map = HashMap<String,Int>()
    map["韩寒"] = 987
    val mapTest = map["韩寒"]
    println(map)
    println(mapTest)
    val teacher: Teacher = Teacher()
    teacher.goHiking()
    teacher.makeFriends()
    teacher.tellStory()
}

interface ThinkingAboutLife {
    fun fromWhere()
    fun whereToGo()
    fun whatShouldDo()
}