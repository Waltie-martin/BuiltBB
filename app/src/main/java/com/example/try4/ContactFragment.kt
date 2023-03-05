package com.example.try4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient


class ContactFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val bView: WebView = view.findViewById(R.id.web5)
        bView.webViewClient = object : WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView,
                url: String
            ): Boolean {
                view.loadUrl(url)
                return true
            }
        }

        bView.loadUrl("https://builtbybuffalo.com/contact")
        bView.settings.javaScriptEnabled
        bView.settings.useWideViewPort = true
        bView.settings.allowContentAccess = true
        bView.settings.domStorageEnabled = true
    }
}