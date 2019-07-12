var express = require('express')
var url = require('url')
var app  = express()
//��̬��Դֱ�ӷ���
//��static/js/jquery.js  ����·��Ϊ http://localhost/js/jquery.js ��script��ǩ��src="js/jquery.js"
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

//�����������Ķ˿�
app.listen(8080,function(){
    console.log('connect successfully')
})