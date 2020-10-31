package com.example.rxjava

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.reactivex.Observable
import io.reactivex.internal.subscribers.SubscriberResourceWrapper
import org.reactivestreams.Subscriber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        switcher.subscribe()
    }


    private val switcher: Observable<String> = io.reactivex.Observable.just("on", "of")


}

