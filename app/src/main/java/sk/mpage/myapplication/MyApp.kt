package sk.mpage.myapplication

import android.app.Application
import com.smartlook.sdk.smartlook.Smartlook

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Smartlook.setupAndStartRecording("")
    }
}