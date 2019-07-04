package com.example.shoprite


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient


class NewFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.fragment_home, container, false)

        val homeWebView = view.findViewById<WebView>(R.id.homeWeb)
        homeWebView.loadUrl("https://www.shoprite.co.ug/whats-new-in-store.html/")

        val webSettings = homeWebView.settings
        webSettings.javaScriptEnabled = true

        homeWebView.webViewClient = WebViewClient()


        return view
    }

}
