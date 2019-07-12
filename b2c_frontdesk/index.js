var express = require('express')
var url = require('url')
var app  = express()
//静态资源直接访问
//如static/js/jquery.js  访问路径为 http://localhost/js/jquery.js 在script标签中src="js/jquery.js"
app.use(express.static('static'))
app.get('/', function (req, res) {
    res.sendFile( __dirname + "/page/" + "index.html" );
})

app.get('*', function (req, res) {
    var pathname = url.parse(req.url).pathname;
    res.sendFile( __dirname + "/page" + pathname );
})

/*app.get('/index.html', function (req, res) {
    var pathname = url.parse(req.url).pathname;
    console.log(pathname);
    console.log("22222");
    res.sendFile( __dirname + "/page/" + "index.html" );
})*/

//定义程序监听的端口
app.listen(8080,function(){
    console.log('connect successfully')
})