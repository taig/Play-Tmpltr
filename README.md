# Play Bootstrapper

An extended templating utility for [Play Framework] \(Scala\) with [Twitter Bootstrap].

This library provides easy Twitter Bootstrap templates for common HTML-widgets like form elements or buttons.

> Using the _Play Bootstrapper_ library should in general be limitited to the [Template] object file.
> When you find yourself importing other files into your views you're either extending the library's
> functionality or you are propably on the wrong track.

> Therefore importing ```com.taig.bootstrapper.Template._``` on the top of your view should be an easy
> way to get started.

## License

The MIT License (MIT)

Copyright (c) 2013 [Nikas Klein](mailto:my.taig@gmail.com)

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.

  [Play Framework]: http://www.playframework.com
  [Twitter Bootstrap]: http://twitter.github.io/bootstrap
  [Template]: src/app/com/taig/bootstrapper/Template.scala
