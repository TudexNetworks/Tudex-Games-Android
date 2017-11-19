package com.tudexnetworks.tudexgames;

import android.content.Intent;
import android.net.Uri;
import android.view.KeyEvent;
import android.webkit.WebView;

/**
 * Created by Alejandro Avellaneda on 19/11/2017.
 */

public class MyWebViewClient {


    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        if (Uri.parse(url).getHost().equals("www.tudexgames.com/v3/app/")) {
            // This is my web site, so do not override; let my WebView load the page
            return false;
        }
        // Otherwise, the link is not for a page on my site, so launch another Activity that handles URLs
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

        return true;
    }



}
