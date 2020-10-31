package com.example.rxjava

import io.reactivex.Observable

fun main() {
    val switcher: Observable<TestModel2> = Observable.just(TestModel2("9527", "Trump"),
        TestModel2("888888","Obama")
    )
    switcher
        .subscribe {
            val rxJavaTest = RxJavaTest()
            rxJavaTest.showModel(it)
        }
}
 class RxJavaTest() {
     fun showModel(model: TestModel2) {
         println(model)
     }
 }
data class TestModel2(
    val id: String,
    val shop_name: String
)

