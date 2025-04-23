<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ page isELIgnored="true" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>注册</title>
    <!-- bootstrap样式，地图插件使用 -->
    <link rel="stylesheet" href="../../css/bootstrap.min.css"/>
    <link rel="stylesheet" href="../../layui/css/layui.css">
    <!-- 样式 -->
    <link rel="stylesheet" href="../../css/style.css"/>
    <!-- 主题（主要颜色设置） -->
    <link rel="stylesheet" href="../../css/theme.css"/>
    <!-- 通用的css -->
    <link rel="stylesheet" href="../../css/common.css"/>
</head>
<body style="background: #EEEEEE; ">


<div id="app">

    <!-- 轮播图 -->
    <div class="layui-carousel" id="swiper">
        <div carousel-item id="swiper-item">
            <div v-for="(item,index) in swiperList" v-bind:key="index">
                <img class="swiper-item" :src="item.img">
            </div>
        </div>
    </div>
    <!-- 轮播图 -->

    <div class="data-add-container">

        <form class="layui-form layui-form-pane" lay-filter="myForm">
            <!-- 级联表的 -->
            <div class="layui-form-item" pane>
                <label class="layui-form-label">活动编号：</label>
                <div class="layui-input-block">
                    <input v-model="huodong.huodongUuidNumber" type="text"  readonly="readonly" name="huodongUuidNumber" id="huodongUuidNumber" autocomplete="off"
                           class="layui-input">
                </div>
            </div>

            <div class="layui-form-item" pane>
                <label class="layui-form-label">活动名称：</label>
                <div class="layui-input-block">
                    <input v-model="huodong.huodongName" type="text"  readonly="readonly" name="huodongName" id="huodongName" autocomplete="off"
                           class="layui-input">
                </div>
            </div>

            <div class="layui-form-item" pane>
                <label class="layui-form-label">活动地点：</label>
                <div class="layui-input-block">
                    <input v-model="huodong.huodongAddress" type="text"  readonly="readonly" name="huodongAddress" id="huodongAddress" autocomplete="off"
                           class="layui-input">
                </div>
            </div>

            <div class="layui-form-item" pane>
                <label class="layui-form-label">疫情信息：</label>
                <div class="layui-input-block">
                    <input v-model="huodong.huodongYiqing" type="text"  readonly="readonly" name="huodongYiqing" id="huodongYiqing" autocomplete="off"
                           class="layui-input">
                </div>
            </div>


            <div class="layui-form-item" pane>
                <label class="layui-form-label">活动照片：</label>
                <div v-if="huodong.huodongPhoto" class="layui-input-block">
                    <img id="huodongPhotoImg"
                         style="width: 100px;height: 100px;border-radius: 50%;border: 2px solid #EEEEEE;"
                         :src="huodong.huodongPhoto">
                    <input type="hidden" :value="detail.huodongPhoto" readonly="readonly" id="huodongPhoto" name="huodongPhoto"/>
                </div>
            </div>
                            <div class="layui-form-item" pane>
                <label class="layui-form-label">活动开始时间：</label>
                <div class="layui-input-block">
                    <input v-model="huodong.kaishiTime" type="text"  readonly="readonly" name="kaishiTime" id="kaishiTime" autocomplete="off"
                           class="layui-input">
                </div>
            </div>

            <div class="layui-form-item" pane>
                <label class="layui-form-label">活动结束时间：</label>
                <div class="layui-input-block">
                    <input v-model="huodong.jieshuTime" type="text"  readonly="readonly" name="jieshuTime" id="jieshuTime" autocomplete="off"
                           class="layui-input">
                </div>
            </div>


            <div class="layui-form-item" pane>
                <label class="layui-form-label">热度：</label>
                <div class="layui-input-inline">
                    <input v-model="huodong.huodongClicknum" type="text" readonly="readonly" name="huodongClicknum" id="huodongClicknum"   placeholder="热度" autocomplete="off" class="layui-input">
                </div>
            </div>


            <!-- 当前表的 -->
<!-- 唯一uuid -->
            <div class="layui-form-item" pane>
                <label class="layui-form-label">报名编号：</label>
                <div class="layui-input-inline">
                    <input v-model="detail.huodongOrderUuidNumber" type="text" name="huodongOrderUuidNumber" id="huodongOrderUuidNumber"  lay-verify="required"   placeholder="报名编号" autocomplete="off" class="layui-input" readonly="readonly">
                </div>
            </div>
            <!-- 级联表的表id -->
            <input type="hidden" :value="huodong.id" id="huodongId" name="huodongId"/>

            <div class="layui-form-item" pane>
                <label class="layui-form-label">健康码：</label>
                <div v-if="detail.huodongOrderJiankangmaPhoto" class="layui-input-block">
                    <img id="huodongOrderJiankangmaPhotoImg"
                         style="width: 100px;height: 100px;border-radius: 50%;border: 2px solid #EEEEEE;"
                         :src="detail.huodongOrderJiankangmaPhoto">
                    <input type="hidden" :value="detail.huodongOrderJiankangmaPhoto" id="huodongOrderJiankangmaPhoto" name="huodongOrderJiankangmaPhoto"/>
                </div>
                <div class="layui-input-block">
                    <button type="button" class="layui-btn btn-theme" id="huodongOrderJiankangmaPhotoUpload">
                        <i class="layui-icon">&#xe67c;</i>上传健康码
                    </button>
                </div>
            </div>
    
            <div class="layui-form-item" pane>
                <label class="layui-form-label">行程码：</label>
                <div v-if="detail.huodongOrderXingchengmaPhoto" class="layui-input-block">
                    <img id="huodongOrderXingchengmaPhotoImg"
                         style="width: 100px;height: 100px;border-radius: 50%;border: 2px solid #EEEEEE;"
                         :src="detail.huodongOrderXingchengmaPhoto">
                    <input type="hidden" :value="detail.huodongOrderXingchengmaPhoto" id="huodongOrderXingchengmaPhoto" name="huodongOrderXingchengmaPhoto"/>
                </div>
                <div class="layui-input-block">
                    <button type="button" class="layui-btn btn-theme" id="huodongOrderXingchengmaPhotoUpload">
                        <i class="layui-icon">&#xe67c;</i>上传行程码
                    </button>
                </div>
            </div>
    
            <div class="layui-form-item" pane>
                <label class="layui-form-label">核算检测报告：</label>
                <div v-if="detail.huodongOrderHesuanbaogaoPhoto" class="layui-input-block">
                    <img id="huodongOrderHesuanbaogaoPhotoImg"
                         style="width: 100px;height: 100px;border-radius: 50%;border: 2px solid #EEEEEE;"
                         :src="detail.huodongOrderHesuanbaogaoPhoto">
                    <input type="hidden" :value="detail.huodongOrderHesuanbaogaoPhoto" id="huodongOrderHesuanbaogaoPhoto" name="huodongOrderHesuanbaogaoPhoto"/>
                </div>
                <div class="layui-input-block">
                    <button type="button" class="layui-btn btn-theme" id="huodongOrderHesuanbaogaoPhotoUpload">
                        <i class="layui-icon">&#xe67c;</i>上传核算检测报告
                    </button>
                </div>
            </div>
    <!-- text后缀 -->
            <div class="layui-form-item layui-form-text input">
                <label class="layui-form-label">个人介绍：</label>
                <div class="layui-input-inline">
                    <textarea
                            style="width: 760px;height:80px"
                            v-model="detail.huodongOrderJieshaoText" name="huodongOrderJieshaoText" id="huodongOrderJieshaoText"  lay-verify="required"   placeholder="个人介绍"></textarea>
                </div>
            </div>
                <%--<div class="layui-form-item" pane>
                <label class="layui-form-label">审核时间：</label>
                <div class="layui-input-block">
                    <input &lt;%&ndash;v-model="detail.huodongOrderShenheTime"&ndash;%&gt; type="text" name="huodongOrderShenheTime" id="huodongOrderShenheTime" placeholder="审核时间" lay-verify="required" autocomplete="off"
                           class="layui-input">
                </div>
            </div>--%>

            <div class="layui-form-item">
                <div class="layui-input-block" style="text-align: right;margin-right: 30px;">
                    <button class="layui-btn btn-submit" lay-submit lay-filter="thisSubmit">提交</button>
                </div>
            </div>
        </form>
    </div>
</div>

<script src="../../layui/layui.js"></script>
<script src="../../js/vue.js"></script>
<!-- 组件配置信息 -->
<script src="../../js/config.js"></script>
<!-- 扩展插件配置信息 -->
<script src="../../modules/config.js"></script>
<!-- 工具方法 -->
<script src="../../js/utils.js"></script>
<!-- 校验格式工具类 -->
<script src="../../js/validate.js"></script>
<!-- 地图 -->
<script type="text/javascript" src="../../js/jquery.js"></script>
<script type="text/javascript" src="http://webapi.amap.com/maps?v=1.3&key=ca04cee7ac952691aa67a131e6f0cee0"></script>
<script type="text/javascript" src="../../js/bootstrap.min.js"></script>
<script type="text/javascript" src="../../js/bootstrap.AMapPositionPicker.js"></script>

<script>
    var jquery = $;

    var vue = new Vue({
        el: '#app',
        data: {
            // 轮播图
            swiperList: [{
                img: '../../img/banner.jpg'
            }],
            // 当前表数据
            detail: {
                huodongOrderUuidNumber: '',
                huodongId: '',
                yonghuId: '',
                huodongOrderJiankangmaPhoto: '',
                huodongOrderXingchengmaPhoto: '',
                huodongOrderHesuanbaogaoPhoto: '',
                huodongOrderJieshaoText: '',
        huodongOrderTypes: '',
        huodongOrderValue: '',
        huodongOrderYesnoTypes: '',
        huodongOrderYesnoValue: '',
                huodongOrderYesnoText: '',
                huodongOrderShenheTime: '',
                insertTime: '',
                createTime: '',
            },

            // 级联表的
            huodong: {},

            // 下拉框
            huodongOrderTypesList: [],
            huodongOrderYesnoTypesList: [],
            centerMenu: centerMenu
        },
        updated: function () {
            layui.form.render('select', 'myForm');
        },
        computed: {},
        methods: {
            jump(url) {
                jump(url)
            }
        }
    })


    layui.use(['layer', 'element', 'carousel', 'http', 'jquery', 'form', 'upload', 'laydate', 'tinymce'], function () {
        var layer = layui.layer;
        var element = layui.element;
        var carousel = layui.carousel;
        var http = layui.http;
        var jquery = layui.jquery;
        var form = layui.form;
        var upload = layui.upload;
        var laydate = layui.laydate;
        var tinymce = layui.tinymce

        // 获取轮播图 数据
        http.request('config/list', 'get', {
            page: 1,
            limit: 5
        }, function(res) {
            if (res.data.list.length > 0) {
                var swiperItemHtml = '';
                for (let item of res.data.list) {
                    if (item.value != "" && item.value != null) {
                        swiperItemHtml +=
                                '<div>' +
                                '<img class="swiper-item" src="' + item.value + '">' +
                                '</div>';
                    }
                }
                jquery('#swiper-item').html(swiperItemHtml);
                // 轮播图
                carousel.render({
                    elem: '#swiper',
                    width: swiper.width,height:swiper.height,
                    arrow: swiper.arrow,
                    anim: swiper.anim,
                    interval: swiper.interval,
                    indicator: "none"
                });
            }
        });


        vue.detail.huodongOrderUuidNumber = new Date().getTime();
        // 级联表数据查询
        initializationhuodong(localStorage.getItem('huodongId'));


        // 下拉框
        // 报名状态的查询和初始化
       huodongOrderTypesSelect();
        // 审核状态的查询和初始化
       huodongOrderYesnoTypesSelect();

        // 上传文件
            		// 健康码的文件上传
        upload.render({
            //绑定元素
            elem: '#huodongOrderJiankangmaPhotoUpload',
            //上传接口
            url: http.baseurl + 'file/upload',
            // 请求头
            headers: {
                Token: localStorage.getItem('Token')
            },
            // 允许上传时校验的文件类型
            accept: 'images',
            before: function () {
                //loading层
                var index = layer.load(1, {
                    shade: [0.1, '#fff'] //0.1透明度的白色背景
                });
            },
            // 上传成功
            done: function (res) {
                console.log(res);
                layer.closeAll();
                if (res.code == 0) {
                    layer.msg("上传成功", {
                        time: 2000,
                        icon: 6
                    })
                    var url = http.baseurl + 'upload/' + res.file;
                    jquery('#huodongOrderJiankangmaPhoto').val(url);
                    vue.detail.huodongOrderJiankangmaPhoto = url;
                    jquery('#huodongOrderJiankangmaPhotoImg').attr('src', url);
                } else {
                    layer.msg(res.msg, {
                        time: 2000,
                        icon: 5
                    })
                }
            },
            //请求异常回调
            error: function () {
                layer.closeAll();
                layer.msg("请求接口异常", {
                    time: 2000,
                    icon: 5
                })
            }
        });
            		// 行程码的文件上传
        upload.render({
            //绑定元素
            elem: '#huodongOrderXingchengmaPhotoUpload',
            //上传接口
            url: http.baseurl + 'file/upload',
            // 请求头
            headers: {
                Token: localStorage.getItem('Token')
            },
            // 允许上传时校验的文件类型
            accept: 'images',
            before: function () {
                //loading层
                var index = layer.load(1, {
                    shade: [0.1, '#fff'] //0.1透明度的白色背景
                });
            },
            // 上传成功
            done: function (res) {
                console.log(res);
                layer.closeAll();
                if (res.code == 0) {
                    layer.msg("上传成功", {
                        time: 2000,
                        icon: 6
                    })
                    var url = http.baseurl + 'upload/' + res.file;
                    jquery('#huodongOrderXingchengmaPhoto').val(url);
                    vue.detail.huodongOrderXingchengmaPhoto = url;
                    jquery('#huodongOrderXingchengmaPhotoImg').attr('src', url);
                } else {
                    layer.msg(res.msg, {
                        time: 2000,
                        icon: 5
                    })
                }
            },
            //请求异常回调
            error: function () {
                layer.closeAll();
                layer.msg("请求接口异常", {
                    time: 2000,
                    icon: 5
                })
            }
        });
            		// 核算检测报告的文件上传
        upload.render({
            //绑定元素
            elem: '#huodongOrderHesuanbaogaoPhotoUpload',
            //上传接口
            url: http.baseurl + 'file/upload',
            // 请求头
            headers: {
                Token: localStorage.getItem('Token')
            },
            // 允许上传时校验的文件类型
            accept: 'images',
            before: function () {
                //loading层
                var index = layer.load(1, {
                    shade: [0.1, '#fff'] //0.1透明度的白色背景
                });
            },
            // 上传成功
            done: function (res) {
                console.log(res);
                layer.closeAll();
                if (res.code == 0) {
                    layer.msg("上传成功", {
                        time: 2000,
                        icon: 6
                    })
                    var url = http.baseurl + 'upload/' + res.file;
                    jquery('#huodongOrderHesuanbaogaoPhoto').val(url);
                    vue.detail.huodongOrderHesuanbaogaoPhoto = url;
                    jquery('#huodongOrderHesuanbaogaoPhotoImg').attr('src', url);
                } else {
                    layer.msg(res.msg, {
                        time: 2000,
                        icon: 5
                    })
                }
            },
            //请求异常回调
            error: function () {
                layer.closeAll();
                layer.msg("请求接口异常", {
                    time: 2000,
                    icon: 5
                })
            }
        });
        // 日期效验规则及格式
        dateTimePick();
        // 表单效验规则
        form.verify({
            // 正整数效验规则
            integer: [
                /^[1-9][0-9]*$/
                ,'必须是正整数'
            ]
            // 小数效验规则
            ,double: [
                /^[1-9][0-9]{0,5}(\.[0-9]{1,2})?$/
                ,'最大整数位为6为,小数最大两位'
            ]
        });

        // session独取
        let table = localStorage.getItem("userTable");
        http.request(table+"/session", 'get', {}, function (data) {
            // 表单赋值
            //form.val("myForm", data.data);
            // data = data.data;
            for (var key in data) {
                vue.detail[table+"Id"] = data.id
            }
        });


        // 提交
        form.on('submit(thisSubmit)', function (data) {
            data = data.field;
            data["yonghuId"]= localStorage.getItem("userid");
            data["huodongOrderYesnoTypes"]= 1;
            // 提交数据
            http.requestJson('huodongOrder/add', 'post', data, function (res) {
                if(res.code == 0){
                    layer.msg('报名成功', {
                        time: 2000,
                        icon: 6
                    }, function () {
                        vue.jump("../huodongOrder/list.jsp");
                        // back();
                    });

                }else{
                    layer.msg(res.msg, {
                        time: 5000,
                        icon: 5
                    });
                }
            });
            return false
        });


        // 日期框初始化
        function dateTimePick(){
            var myDate = new Date();  //获取当前时间
            /*
                ,change: function(value, date, endDate){
                    value       得到日期生成的值，如：2017-08-18
                    date        得到日期时间对象：{year: 2017, month: 8, date: 18, hours: 0, minutes: 0, seconds: 0}
                    endDate     得结束的日期时间对象，开启范围选择（range: true）才会返回。对象成员同上。
            */
            // 审核时间的开始时间和结束时间的效验及格式
            var huodongOrderShenheTime = laydate.render({
                elem: '#huodongOrderShenheTime'
	            ,type: 'datetime'
                ,min:myDate.toLocaleString()
            });
        }




       // 报名状态的查询
       function huodongOrderTypesSelect() {
           //填充下拉框选项
           http.request("dictionary/page?page=1&limit=100&sort=&order=&dicCode=huodong_order_types", "GET", {}, (res) => {
               if(res.code == 0){
                   vue.huodongOrderTypesList = res.data.list;
               }
           });
       }


       // 审核状态的查询
       function huodongOrderYesnoTypesSelect() {
           //填充下拉框选项
           http.request("dictionary/page?page=1&limit=100&sort=&order=&dicCode=huodong_order_yesno_types", "GET", {}, (res) => {
               if(res.code == 0){
                   vue.huodongOrderYesnoTypesList = res.data.list;
               }
           });
       }




        function initializationhuodong(id){
            // 详情赋值
            http.request("huodong/detail/" + id, 'get', {}, function (res) {
                if(res.code ==0){
                    vue.huodong = res.data;
                }
            });
        }
    });
</script>
</body>
</html>