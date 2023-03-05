package com.example.try4.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.try4.R
import com.example.try4.databinding.FragmentHomeBinding
import java.net.URL

class HomeFragment : Fragment() {

      override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
      return inflater.inflate(R.layout.fragment_home,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val bView: WebView = view.findViewById(R.id.web1)
        bView.webViewClient = object : WebViewClient(){
            override fun shouldOverrideUrlLoading(
                view: WebView,
                url: String
            ): Boolean {
                view.loadUrl(url)
                return true
            }
        }

        bView.loadUrl("https://builtbybuffalo.com/")
        bView.settings.javaScriptEnabled
        bView.settings.useWideViewPort = true
        bView.settings.allowContentAccess = true
        bView.settings.domStorageEnabled = true
    }
}