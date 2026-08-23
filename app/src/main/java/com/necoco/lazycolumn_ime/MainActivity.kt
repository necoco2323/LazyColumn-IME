package com.necoco.lazycolumn_ime

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.necoco.lazycolumn_ime.ui.theme.LazyColumnIMETheme

/* offset */
//import com.necoco.lazycolumn_ime.offset.OffsetScreen as Screen

/* inset */
import com.necoco.lazycolumn_ime.scroll.launchedEffect.inset.ScrollScreen as Screen

/* viewport */
//import com.necoco.lazycolumn_ime.scroll.launchedEffect.viewport.ScrollScreen as Screen

/* eventflag */
//import com.necoco.lazycolumn_ime.scroll.androidView_launchedEffect.eventflag.ScrollScreen as Screen

/* dispatchRawDelta */
//import com.necoco.lazycolumn_ime.scroll.androidView.rawdelta.ScrollScreen as Screen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LazyColumnIMETheme {
                Screen()
            }
        }
    }
}