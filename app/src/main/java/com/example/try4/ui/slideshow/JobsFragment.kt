package com.example.try4.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.example.try4.R

class JobsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_slideshow,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val bView: WebView = view.findViewById(R.id.web3)
        bView.webViewClient = object : WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView,
                url: String
            ): Boolean {
                view.loadUrl(url)
                return true
            }
        }

        bView.loadUrl("https://builtbybuffalo.com/jobs")
        bView.settings.javaScriptEnabled
        bView.settings.useWideViewPort = true
        bView.settings.allowContentAccess = true
        bView.settings.domStorageEnabled = true
    }
}