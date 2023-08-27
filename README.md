# What is _Arcane Responsive Layout Test_?  
**ArcaneLT is a tool to assist in the front-end development of web pages, it allows you to load the page in different resolutions on your Android device, it allows you to see how the site behaves in certain resolutions.**  
## How Arcane Works?
* Arcane is _pure JS_, that is, **all the code is done in Javascript** and the Android webView component is only responsible for rendering and executing the JS code.  
* To be able to rotate the same page in several resolutions, the _iframe_ tag is used, its **src** attribute is changed via JS.
* In addition, the HTML code uses direct values ​​for the _viewport_ tag, see an example:
~~~html
<!DOCTYPE HTML>
<html>
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  </head>
~~~
when we change the value of _initial-scale_, we are changing the zoom of the page for mobile devices, which makes it possible to use any type of resolution in the _iframe tag_, even if that resolution is greater than the resolution of the device.
