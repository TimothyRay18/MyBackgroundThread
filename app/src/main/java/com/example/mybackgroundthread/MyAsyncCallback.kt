package com.example.mybackgroundthread

interface MyAsyncCallback {
    fun onPreExecute()
    fun onPostExecute(text: String)
}