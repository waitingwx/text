package com.wx.alltestdemo;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wx on 2017/10/9.
 */

public class WholeBean {

    /**
     * code : 10000
     * message : success
     * result : {"dataList":[{"id":254,"name":"轮播图","icon":"","desc":"","hasmore":1,"moreType":3,"componentType":1,"contentType":1,"relatedValue":"-1","pic":"","contentSourceId":6,"count":0,"dataList":[{"rid":2091640,"rtype":13,"rname":"仨贱客","pic":"http://img.kaolafm.net/mz/images/201704/64dca3a5-b934-4cd2-95eb-f5fd3cac3735/default.jpg","weburl":"","des":"仨贱客","albumName":"","albumId":-1,"num":0,"host":[],"mp3PlayUrl":"","cornerMark":0,"rvalue":"2091640","tip":"","followedNum":0,"listenNum":0,"area":null,"reportUrl":[],"expoUrl":[],"adType":-1,"adUserId":"","adId":"","dataReport":"仨贱客","dataList":[],"isSubscribe":0,"callback":null},{"rid":1300000001347,"rtype":2,"rname":"治愈良药：十大金牌段子王","pic":"http://img.kaolafm.net/mz/images/201706/332e710f-ac02-4897-a357-fa20ec172611/default.jpg","weburl":"http://m.kaolafm.com/client/special/1300000001347.html?id=1300000001347&type=6","des":"治愈良药：十大金牌段子王","albumName":"","albumId":-1,"num":0,"host":[],"mp3PlayUrl":"","cornerMark":0,"rvalue":"http://m.kaolafm.com/client/special/1300000001347.html?id=1300000001347&type=6","tip":"","followedNum":0,"listenNum":0,"area":null,"reportUrl":[],"expoUrl":[],"adType":-1,"adUserId":"","adId":"","dataReport":"治愈良药：十大金牌段子王","dataList":[],"isSubscribe":0,"callback":null},{"rid":1300000001354,"rtype":2,"rname":"观点大本营 思想兵工厂","pic":"http://img.kaolafm.net/mz/images/201706/8191906a-3187-4f4e-8afe-5d48cf9860e8/default.jpg","weburl":"http://m.kaolafm.com/client/special/1300000001354.html?id=1300000001354&type=6","des":"每天新闻这么多，听听大家怎么说！这里汇集最及时的热辣新闻、最精辟的独到分析和最动人的故事！","albumName":"","albumId":-1,"num":0,"host":[],"mp3PlayUrl":"","cornerMark":0,"rvalue":"http://m.kaolafm.com/client/special/1300000001354.html?id=1300000001354&type=6","tip":"","followedNum":0,"listenNum":0,"area":null,"reportUrl":[],"expoUrl":[],"adType":-1,"adUserId":"","adId":"","dataReport":"观点大本营 思想兵工厂","dataList":[],"isSubscribe":0,"callback":null},{"rid":1300000001508,"rtype":2,"rname":"考拉金牌主播：用声音，带你去旅行","pic":"http://img.kaolafm.net/mz/images/201706/087147c4-7d40-425f-b14b-67479c0f61f6/default.jpg","weburl":"http://m.kaolafm.com/client/special/1300000001508.html?id=1300000001508&type=6","des":"考拉好声音，你值得拥有","albumName":"","albumId":-1,"num":0,"host":[],"mp3PlayUrl":"","cornerMark":0,"rvalue":"http://m.kaolafm.com/client/special/1300000001508.html?id=1300000001508&type=6","tip":"","followedNum":0,"listenNum":0,"area":null,"reportUrl":[],"expoUrl":[],"adType":-1,"adUserId":"","adId":"","dataReport":"考拉金牌主播：用声音，带你去旅行","dataList":[],"isSubscribe":0,"callback":null},{"rid":1300000001344,"rtype":2,"rname":"股民福音！股市行家抱团来袭！","pic":"http://img.kaolafm.net/mz/images/201706/de2e8673-ec9e-41fc-93f1-6821112600c4/default.jpg","weburl":"http://m.kaolafm.com/client/special/1300000001344.html?id=1300000001344&type=6","des":"作为一个中国股民，必须经得住涨停的狂喜，顶得住跌停的悲怆，套得住隐藏的黑马，爱得起波动的大盘。哎，你手中个股涨还是跌，如何把握机会？憋着急！考拉君为你准备了最专业的股市行情早晚评，跟股市达人一起成长！","albumName":"","albumId":-1,"num":0,"host":[],"mp3PlayUrl":"","cornerMark":0,"rvalue":"http://m.kaolafm.com/client/special/1300000001344.html?id=1300000001344&type=6","tip":"","followedNum":0,"listenNum":0,"area":null,"reportUrl":[],"expoUrl":[],"adType":-1,"adUserId":"","adId":"","dataReport":"股民福音！股市行家抱团来袭！","dataList":[],"isSubscribe":0,"callback":null}]},{"id":255,"name":"主播发现滚动文字","icon":"","desc":"","hasmore":1,"moreType":3,"componentType":31,"contentType":1,"relatedValue":"-1","pic":"","contentSourceId":6,"count":0,"dataList":[{"rid":1100000000078,"rtype":0,"rname":"著名网红王钢蛋的节目更新啦","pic":"http://img.kaolafm.net/mz/images/201510/79de75a0-c9fc-4d90-968d-e44acf139a9e/default.jpg","weburl":"","des":"著名网红王钢蛋的节目更新啦","albumName":"二货一箩筐","albumId":-1,"num":0,"host":[],"mp3PlayUrl":"","cornerMark":0,"rvalue":"1100000000078","tip":"","followedNum":0,"listenNum":0,"area":null,"reportUrl":[],"expoUrl":[],"adType":-1,"adUserId":"","adId":"","dataReport":"二货一箩筐","dataList":[],"isSubscribe":0,"callback":null},{"rid":1100000000012,"rtype":0,"rname":"著名搞笑主播小胆更新了《不亦乐乎》","pic":"http://img.kaolafm.net/mz/images/201409/cb7811b5-1b0b-4307-a535-ac90c4abb9ea/100_100.jpg","weburl":"","des":"著名搞笑主播小胆更新了《不亦乐乎》","albumName":"不亦乐乎","albumId":-1,"num":0,"host":[],"mp3PlayUrl":"","cornerMark":0,"rvalue":"1100000000012","tip":"","followedNum":0,"listenNum":0,"area":null,"reportUrl":[],"expoUrl":[],"adType":-1,"adUserId":"","adId":"","dataReport":"不亦乐乎","dataList":[],"isSubscribe":0,"callback":null},{"rid":1100000000416,"rtype":0,"rname":"\u201c贱人天团\u201d亲情演绎情景广播喜剧","pic":"http://img.kaolafm.net/mz/images/201505/7e72e6ce-0315-494d-8fc0-6d7c00289ac0/default.jpg","weburl":"","des":"\u201c贱人天团\u201d亲情演绎情景广播喜剧","albumName":"仨贱客","albumId":-1,"num":0,"host":[],"mp3PlayUrl":"","cornerMark":0,"rvalue":"1100000000416","tip":"","followedNum":0,"listenNum":0,"area":null,"reportUrl":[],"expoUrl":[],"adType":-1,"adUserId":"","adId":"","dataReport":"仨贱客","dataList":[],"isSubscribe":0,"callback":null},{"rid":1100000095433,"rtype":0,"rname":"空空道人入驻考拉fm,另类解读股市","pic":"http://img.kaolafm.net/mz/images/201601/d1b4de15-db6b-4eae-a97a-7ffaf6f57d6d/default.jpg","weburl":"","des":"空空道人入驻考拉fm,另类解读股市","albumName":"股市","albumId":-1,"num":0,"host":[],"mp3PlayUrl":"","cornerMark":0,"rvalue":"1100000095433","tip":"","followedNum":0,"listenNum":0,"area":null,"reportUrl":[],"expoUrl":[],"adType":-1,"adUserId":"","adId":"","dataReport":"股市","dataList":[],"isSubscribe":0,"callback":null},{"rid":1100000000747,"rtype":0,"rname":"治愈系专家寒霜来袭","pic":"http://img.kaolafm.net/mz/images/201412/57027d68-bd12-45b1-97a3-d92daf5549a4/default.jpg","weburl":"","des":"治愈系专家寒霜来袭","albumName":"情感治愈系","albumId":-1,"num":0,"host":[],"mp3PlayUrl":"","cornerMark":0,"rvalue":"1100000000747","tip":"","followedNum":0,"listenNum":0,"area":null,"reportUrl":[],"expoUrl":[],"adType":-1,"adUserId":"","adId":"","dataReport":"情感治愈系","dataList":[],"isSubscribe":0,"callback":null}]},{"id":256,"name":"人气主播","icon":"","desc":"","hasmore":0,"moreType":6,"componentType":26,"contentType":4,"relatedValue":"0","pic":"","contentSourceId":6,"count":0,"dataList":[{"uid":2087514,"nickName":"晓宇","avatar":"http://img.kaolafm.net/mz/images/201605/8feb042e-90f5-4662-a63c-451e72ae11c2/default.jpg","likedNum":0,"isVanchor":1,"gender":3,"liveStatus":0,"recommendReson":"活泼逗比女主播","extraAttributes":"","relation":0,"fansCount":905,"desc":"TA懒懒的什么也没写"},{"uid":2084038,"nickName":"寒霜","avatar":"http://img.kaolafm.net/mz/images/201511/10801d33-e8a0-4adb-9eef-7fa41db5be26/default.jpg","likedNum":6961958,"isVanchor":1,"gender":1,"liveStatus":0,"recommendReson":"","extraAttributes":"","relation":0,"fansCount":10156,"desc":"情感治愈系 声音创可贴  我是寒霜"},{"uid":2088778,"nickName":"程一电台","avatar":"http://img.kaolafm.net/mz/images/201510/1c1226ac-ca8a-40d7-8aff-50812ed7418a/default.jpg","likedNum":0,"isVanchor":1,"gender":0,"liveStatus":0,"recommendReson":"微博签约自媒体人","extraAttributes":"","relation":0,"fansCount":4307,"desc":"睡前一段优美文字，一首暖心歌曲。声音是有温度的，夜晚的声音会发光。新浪微博DJ程一，微信公众号djchengyi。感谢各位的支持。 "},{"uid":3295655,"nickName":"金融八卦女APP","avatar":"http://img.kaolafm.net/mz/images/201612/3854e051-34f8-4275-9a1a-382ece1f87e1/default.jpg","likedNum":0,"isVanchor":1,"gender":2,"liveStatus":0,"recommendReson":"","extraAttributes":"","relation":0,"fansCount":16,"desc":"金融八卦女"},{"uid":2102332,"nickName":"凯叔讲故事","avatar":"http://img.kaolafm.net/mz/images/201709/8af63a84-3838-4c4a-9fb8-c1256c06e223/default.jpg","likedNum":0,"isVanchor":1,"gender":0,"liveStatus":0,"recommendReson":"给孩子们讲故事","extraAttributes":"","relation":0,"fansCount":317,"desc":"优质儿童故事自媒体平台。由著名主持人，两个女儿的父亲光头王凯创立。两天一次优质儿童绘本故事推送，每天一篇经典育儿文章推荐，更多互动活动为宝贝提供展示平台，帮助宝贝塑造健康的人格，和孩子一起成长。\r\n凯叔讲故事微信公众号：kaishujianggushi"},{"uid":4240248,"nickName":"36氪","avatar":"http://img.kaolafm.net/mz/images/201706/2563d49b-3618-4475-98c9-343b003b01c3/default.jpg","likedNum":0,"isVanchor":1,"gender":3,"liveStatus":0,"recommendReson":"","extraAttributes":"","relation":0,"fansCount":32,"desc":"TA懒懒的什么也没写"}]},{"id":257,"name":"最新入驻","icon":"","desc":"","hasmore":1,"moreType":6,"componentType":26,"contentType":4,"relatedValue":"id=-1&type=-1&sorttype=2","pic":"","contentSourceId":6,"count":0,"dataList":[{"uid":3298462,"nickName":"湛庐FM","avatar":"http://img.kaolafm.net/mz/images/201612/2015c647-837a-434c-b126-444630a8eec3/default.jpg","likedNum":0,"isVanchor":0,"gender":3,"liveStatus":0,"recommendReson":"思想者的声音图书馆","extraAttributes":"","relation":0,"fansCount":106,"desc":"思想者的声音图书馆，湛庐文化出品。"},{"uid":4289902,"nickName":"CRI国际在线","avatar":"http://img.kaolafm.net/mz/images/201707/ea052ea8-fd7c-4152-a08d-e8c148be46ca/default.png","likedNum":0,"isVanchor":1,"gender":3,"liveStatus":0,"recommendReson":"国际化新媒体平台","extraAttributes":"","relation":0,"fansCount":30,"desc":"国际在线(www.cri.cn)于1998年12月26日正式建立，是由中国国际广播电台(简称\u201cCRI\u201d)主办的中央重点新闻网站，通过61个语种对全球进行传播，是中国使用语种最多、传播地域最广、影响人群最大的多应用、多终端网站集群。\r\n\r\n国际在线依托CRI广泛的资讯渠道和媒体资源，在全球拥有40多个驻外记者站，与许多国家的驻华机构建立了良好的合作关系，已发展成为拥有强大的信息采集网络、多形态传播渠道的国际化新媒体平台。\r\n\r\n国际在线依托独有的全球资源，重点打造新闻、城市、企业、旅游等业务线，面向具有跨地域、跨语言、跨文化需求的海内外用户，提供国际化资讯和营销服务。"},{"uid":3264987,"nickName":"哥就是猛哥","avatar":"http://img.kaolafm.net/mz/images/201701/5403bfc3-96b1-46a6-9016-a52eed0a6a40/default.jpg","likedNum":0,"isVanchor":0,"gender":3,"liveStatus":0,"recommendReson":"探索都市传说的高富帅","extraAttributes":"","relation":0,"fansCount":33,"desc":"天使投资人，魔宙电台主持人，寻找有故事的超能力者"}]},{"id":259,"name":"搞笑主播","icon":"","desc":"","hasmore":1,"moreType":6,"componentType":26,"contentType":4,"relatedValue":"id=648&type=2&sorttype=","pic":"","contentSourceId":6,"count":0,"dataList":[{"uid":4152733,"nickName":"主播萱草","avatar":"http://img.kaolafm.net/mz/images/201703/db354191-418b-459d-b4f8-e2ec11b2b997/default.jpg","likedNum":0,"isVanchor":1,"gender":1,"liveStatus":0,"recommendReson":"污力少女性感声线","extraAttributes":"","relation":0,"fansCount":314,"desc":"希望我的声音能为你带来一整天的好心情！主播微博：@亦萱Hana"},{"uid":2088760,"nickName":"胖大海","avatar":"http://img.kaolafm.net/mz/images/201703/08dffe41-bbdc-499f-9ade-828114387bf4/default.jpg","likedNum":430,"isVanchor":1,"gender":0,"liveStatus":0,"recommendReson":"认真的搞笑理性的逗比","extraAttributes":"","relation":0,"fansCount":126,"desc":"简直就是笑话主播"},{"uid":2084518,"nickName":"度娘电台","avatar":"http://img.kaolafm.net/mz/images/201605/0de2d735-5a2c-48a1-ae93-34347a8c94c2/default.jpg","likedNum":0,"isVanchor":1,"gender":3,"liveStatus":0,"recommendReson":"一枚声音甜美的萝莉","extraAttributes":"","relation":0,"fansCount":1369,"desc":"TA懒懒的什么也没写"}]},{"id":260,"name":"情感主播","icon":"","desc":"","hasmore":1,"moreType":6,"componentType":26,"contentType":4,"relatedValue":"id=699&type=2&sorttype=","pic":"","contentSourceId":6,"count":0,"dataList":[{"uid":2301784,"nickName":"陈保才","avatar":"http://img.kaolafm.net/mz/images/201602/7eacb5d2-cf64-4396-896d-19ed06a60059/default.jpg","likedNum":0,"isVanchor":0,"gender":0,"liveStatus":0,"recommendReson":"情感教父陈保才","extraAttributes":"","relation":0,"fansCount":309,"desc":"TA懒懒的什么也没写"},{"uid":2131195,"nickName":"声音者宇阳","avatar":"http://img.kaolafm.net/mz/images/201510/846f0505-892d-48be-8bf8-6af55f743fdb/default.jpg","likedNum":1524,"isVanchor":0,"gender":0,"liveStatus":0,"recommendReson":"磁性男声温暖黑夜","extraAttributes":"","relation":0,"fansCount":143,"desc":"丑的不明显"},{"uid":2132062,"nickName":"月光浮屿网络电台","avatar":"http://img.kaolafm.net/mz/images/201510/9476cc2f-343f-4ace-a31a-73a34aa679c7/default.jpg","likedNum":0,"isVanchor":0,"gender":0,"liveStatus":0,"recommendReson":"一个有温度的电台","extraAttributes":"","relation":0,"fansCount":34,"desc":"TA懒懒的什么也没写"}]},{"id":263,"name":"小说主播","icon":"","desc":"","hasmore":1,"moreType":6,"componentType":26,"contentType":4,"relatedValue":"id=32&type=2&sorttype=","pic":"","contentSourceId":6,"count":0,"dataList":[{"uid":2495471,"nickName":"梵心境水","avatar":"http://img.kaolafm.net/mz/images/201709/f54aaf6f-c8d8-4cc5-8046-d1f639564394/default.jpg","likedNum":0,"isVanchor":1,"gender":1,"liveStatus":0,"recommendReson":"古言勤劳小蜜蜂","extraAttributes":"","relation":0,"fansCount":810,"desc":"QQ听友群593499100，古风、现代言情，各类小说，好的故事与大家共同分享！境水在这里求赞求评论求关注啦，你们的支持会给境水带来最大的动力哦\u2026\u2026么么哒！"},{"uid":2952100,"nickName":"小镇的猫","avatar":"http://img.kaolafm.net/mz/images/201607/8ce45662-df3b-4e54-ba47-0901e3cb1703/default.jpg","likedNum":21111,"isVanchor":1,"gender":0,"liveStatus":0,"recommendReson":"惊悚作品点赞过万","extraAttributes":"","relation":0,"fansCount":122,"desc":"职业催眠师-小镇的猫"},{"uid":2134117,"nickName":"演播玉麒麟","avatar":"http://img.kaolafm.net/mz/images/201611/2334e710-dd7a-4125-be47-0844a6f49506/default.jpg","likedNum":0,"isVanchor":1,"gender":0,"liveStatus":0,"recommendReson":"出品惊悚小说","extraAttributes":"","relation":0,"fansCount":201,"desc":"玉麒麟：知名有声博客 微信公众号\u201c有声玉麒麟\u201d QQ听友群：151115014"}]},{"id":264,"name":"脱口秀主播","icon":"","desc":"","hasmore":1,"moreType":6,"componentType":26,"contentType":4,"relatedValue":"id=25&type=2&sorttype=","pic":"","contentSourceId":6,"count":0,"dataList":[{"uid":3149705,"nickName":"我是小新家的姐姐","avatar":"http://img.kaolafm.net/mz/images/201609/ebba5ad1-1fe4-4ce1-8fe6-c45e14c44a1d/default.jpg","likedNum":0,"isVanchor":1,"gender":1,"liveStatus":0,"recommendReson":"知性姐姐聊留学","extraAttributes":"","relation":0,"fansCount":49,"desc":"我有一个特别伟\u2026\u2026伟\u2026\u2026伟\u2026\u2026伟\u2026\u2026伟\u2026\u2026大的理想，帮助中国学子提升全球竞争力！让我们每天进步一点点，成长一点点！"},{"uid":2059345,"nickName":"干嘛电台","avatar":"http://img.kaolafm.net/mz/images/201510/73d3ca94-7df4-45d2-bc9e-c5a1df005e00/default.jpg","likedNum":0,"isVanchor":1,"gender":0,"liveStatus":0,"recommendReson":"祖传话痨，三代遗传","extraAttributes":"","relation":0,"fansCount":21,"desc":"qq群：567997389 \n微博@干嘛电台 每天更新段子\n微信订阅号@干嘛播客 每天更新段子集\n支付宝 ballagt11@sina.com 给钱支持就行了！\n淘宝店@干嘛电台 买！就对了！"},{"uid":2059435,"nickName":"大内密谈","avatar":"http://img.kaolafm.net/mz/images/201705/3d73b0a2-6205-45a9-b146-3e767e0b2443/default.jpg","likedNum":0,"isVanchor":0,"gender":0,"liveStatus":0,"recommendReson":"有逼格，有态度，有料","extraAttributes":"","relation":0,"fansCount":19,"desc":"TA懒懒的什么也没写"}]},{"id":300,"name":"财经主播","icon":"","desc":"","hasmore":1,"moreType":6,"componentType":26,"contentType":4,"relatedValue":"id=91&type=2&sorttype=","pic":"","contentSourceId":6,"count":0,"dataList":[{"uid":2316005,"nickName":"空空道人厚黑堂","avatar":"http://img.kaolafm.net/mz/images/201511/ac9dd625-8898-4922-b54a-e2208cc3e319/default.jpg","likedNum":7714261,"isVanchor":1,"gender":3,"liveStatus":0,"recommendReson":"财经达人","extraAttributes":"","relation":0,"fansCount":15477,"desc":"《《《  您听了就不会离开了  》》》\r\n\r\n\r\n《空空道人谈股市》是由中国十大自媒体获得者、中央经济广播的特约嘉宾、厚黑操盘学创始人空空道人主创的，预测大盘走势、解读复杂政策是强项，对于2014年7月中下旬的反弹提早发现、2015.6.15在博客里说今天应该你走我也走，2015.12.23在直播的时候说2:15如果上升就会在3684点拐头向下，经典不断百听不厌！"},{"uid":2105380,"nickName":"公牛财富","avatar":"http://img.kaolafm.net/mz/images/201510/88c4a049-7f49-48bd-a6c7-d21e7d9ffb72/default.jpg","likedNum":0,"isVanchor":0,"gender":0,"liveStatus":0,"recommendReson":"小清新聊股市","extraAttributes":"","relation":0,"fansCount":105,"desc":"学习玩耍两不误！小白炒股学堂，你的股神之路从这里开启！微信公众号/新浪微博：小白炒股学堂"},{"uid":2065280,"nickName":"力哥说理财","avatar":"http://img.kaolafm.net/mz/images/201612/345acd03-2d5f-493b-a26a-04db26c66414/default.jpg","likedNum":0,"isVanchor":0,"gender":0,"liveStatus":0,"recommendReson":"居家好男银","extraAttributes":"","relation":0,"fansCount":153,"desc":"娱乐理财脱口秀创始人，资深财经媒体人，国家理财规划师（Chfp），分享简单、好玩、有干货的理财智慧和赚钱技巧。"}]},{"id":301,"name":"科技主播","icon":"","desc":"","hasmore":1,"moreType":6,"componentType":26,"contentType":4,"relatedValue":"id=93&type=2&sorttype=","pic":"","contentSourceId":6,"count":0,"dataList":[{"uid":2192292,"nickName":"智东西","avatar":"http://img.kaolafm.net/mz/images/201510/aa9316b2-f1df-4563-a217-8ce984212dda/default.jpg","likedNum":75670,"isVanchor":1,"gender":0,"liveStatus":0,"recommendReson":"智能硬件第一媒体","extraAttributes":"","relation":0,"fansCount":152,"desc":"智东西目前已经是绝对领先的智能硬件行业媒体，全媒体覆盖千万读者；几位极富经验的媒体人创办一年来，已经受邀参与报道了CES（美国消费电子展）、MWC（巴塞罗那移动大会）、IDF（旧金山英特尔技术峰会）、德国红点大奖，还将参与到IFA（柏林消费电子展）以及苹果新品发布等绝大部分行业大会的现场报道，20万业界人士每日必读。\r\n\r\n热门栏目：\r\n\r\n●每日一头条●\r\n趋势·深度·犀利·干货，最专业的深喉爆料、行业解读！\r\n\r\n●每日一早报●\r\n热点·新品·招聘·资源·活动，最有效的行业对接！\r\n\r\n●每日一硬创●\r\n硬创先锋，挖掘全球最具潜力的硬件创业项目！"},{"uid":2095266,"nickName":"lida","avatar":"http://img.kaolafm.net/mz/images/201605/ecf30aa8-c72f-4880-8812-a3ca163b373b/default.png","likedNum":8946,"isVanchor":1,"gender":0,"liveStatus":0,"recommendReson":"科技DIY达人","extraAttributes":"","relation":0,"fansCount":102,"desc":"微信公号：lidafm 邮箱：lidasir@163.com"},{"uid":2281276,"nickName":"王掌柜","avatar":"http://img.kaolafm.net/mz/images/201510/98610a12-0c5d-4e84-a886-f5d7dd6dbae1/default.png","likedNum":0,"isVanchor":0,"gender":3,"liveStatus":0,"recommendReson":"极客主播","extraAttributes":"","relation":0,"fansCount":46,"desc":"TA懒懒的什么也没写"}]},{"id":302,"name":"音乐主播","icon":"","desc":"","hasmore":1,"moreType":6,"componentType":26,"contentType":4,"relatedValue":"id=255&type=2&sorttype=","pic":"","contentSourceId":6,"count":0,"dataList":[{"uid":2791390,"nickName":"歌者盟音乐","avatar":"http://img.kaolafm.net/mz/images/201605/a055eb55-5661-4829-9210-d980ae6c7092/default.png","likedNum":0,"isVanchor":1,"gender":3,"liveStatus":0,"recommendReson":"教你把歌唱好听","extraAttributes":"","relation":0,"fansCount":230,"desc":"欢迎来到歌者盟音乐，节目不定时推荐，欢迎私信骚扰小编\r\n帮助广大声乐爱好者从零基础开始专业学习现代流行唱法的知识和技巧，通过练习逐渐进行入门提高。 \r\n科学系统的为您解决高音上不去、低音下不来、气息不够用、音色不好听、唱歌容易累、感情不到位、五音不全等问题，\r\n全面提高你的唱歌水平。\r\n"},{"uid":2864289,"nickName":"陌上东风拂白衣","avatar":"http://img.kaolafm.net/mz/images/201703/bbfe4c2c-2992-4f1b-8417-710628e8bdd4/default.jpg","likedNum":0,"isVanchor":0,"gender":0,"liveStatus":0,"recommendReson":"最时尚，最流行","extraAttributes":"","relation":0,"fansCount":112,"desc":"\u201c陌白咖调音乐小村庄\u201d(企鹅号567116903)成立于2015年，这里是大学生公益音乐电台，这里是爱好音乐的大家的交流公会。无论你是古风圈还是二次圈，无论你是小白还是大触。村长漓听欢迎你的到来，为我们热爱的音乐贡献一份力量。（更多内容请关注公众微信\u201c陌白咖调音乐小村庄\u201d或\u201cmobaikadiao\u201d）"},{"uid":2289649,"nickName":"微音","avatar":"http://img.kaolafm.net/mz/images/201706/bad70edf-c64c-480e-a539-1c8479cbec22/default.jpg","likedNum":0,"isVanchor":1,"gender":3,"liveStatus":0,"recommendReson":"清新美女主播","extraAttributes":"","relation":0,"fansCount":815,"desc":"TA懒懒的什么也没写"}]},{"id":303,"name":"娱乐主播","icon":"","desc":"","hasmore":1,"moreType":6,"componentType":26,"contentType":4,"relatedValue":"id=12&type=2&sorttype=","pic":"","contentSourceId":6,"count":0,"dataList":[{"uid":2090540,"nickName":"巴拉","avatar":"http://img.kaolafm.net/mz/images/201510/29ccf41d-25e3-4e40-b4e9-11fed825b985/default.jpg","likedNum":0,"isVanchor":0,"gender":0,"liveStatus":0,"recommendReson":"碎嘴毒辣男主播","extraAttributes":"","relation":0,"fansCount":236,"desc":"碎嘴毒辣有内涵，机制果敢很武断的80后潮男一枚。"},{"uid":2147713,"nickName":"我和美男子","avatar":"http://img.kaolafm.net/mz/images/201510/03c1b7fc-86f7-443a-b746-297e027d4981/default.jpg","likedNum":0,"isVanchor":0,"gender":1,"liveStatus":0,"recommendReson":"可攻可受女主播","extraAttributes":"","relation":0,"fansCount":170,"desc":"一档激情群p的深夜电台。两个00后美少女主播可攻可受可萝莉可妖孽。我们的目标是：上遍所有美男子！每一夜，用声音刺激你的肾上腺，让你的耳朵流产。每周五晚10点准时更新，欢迎大家收听。我们的微信公众号：美男子天团。好巧，我们的微博也是\u201d美男子天团\u201c呢！"},{"uid":2117231,"nickName":"haha小公主","avatar":"http://img.kaolafm.net/mz/images/201512/6715771d-dbec-4633-a60d-b83f65ab522f/default.png","likedNum":11077161,"isVanchor":0,"gender":1,"liveStatus":0,"recommendReson":"叫床服务女主播","extraAttributes":"","relation":0,"fansCount":2136,"desc":"一个集美貌、智慧、才华和不要脸与一身的女主播。"}]},{"id":304,"name":"曲艺主播","icon":"","desc":"","hasmore":1,"moreType":6,"componentType":26,"contentType":4,"relatedValue":"id=114&type=2&sorttype=","pic":"","contentSourceId":6,"count":0,"dataList":[{"uid":2415277,"nickName":"说书人初田天","avatar":"http://img.kaolafm.net/mz/images/201606/3fbd6e0c-6621-4905-abb0-9761608fbdfb/default.jpg","likedNum":2674,"isVanchor":1,"gender":0,"liveStatus":0,"recommendReson":"另类说书人","extraAttributes":"","relation":0,"fansCount":168,"desc":"月色下，一起观天上乌飞兔走，听人间古往今来。\r\n说书人初田天，代表作《我的邻居是妖怪》、《河神：鬼水怪谈》、《死亡循环》、《鬼吹灯之牧野鬼事》、《谜踪之国》等。\r\n新浪微博：@孔夫子也怕混蛋"},{"uid":2358561,"nickName":"青曲社的小青虫","avatar":"http://img.kaolafm.net/mz/images/201601/bfad8a40-ab71-41e2-8792-a4c7a4755d29/default.jpg","likedNum":0,"isVanchor":0,"gender":3,"liveStatus":0,"recommendReson":"青曲社骨灰粉","extraAttributes":"","relation":0,"fansCount":295,"desc":"TA懒懒的什么也没写"},{"uid":2083918,"nickName":"张准","avatar":"http://img.kaolafm.net/mz/images/201510/37ff2dde-6cfd-4e0d-871d-236ff7cc811f/default.jpg","likedNum":0,"isVanchor":0,"gender":0,"liveStatus":0,"recommendReson":"创意评书播讲人","extraAttributes":"","relation":0,"fansCount":344,"desc":"请加我的创意评书qq群，1 9 1 5 5 3 6 4 6"}]},{"id":305,"name":"星座风水主播","icon":"","desc":"","hasmore":1,"moreType":6,"componentType":26,"contentType":4,"relatedValue":"id=195&type=2&sorttype=","pic":"","contentSourceId":6,"count":0,"dataList":[{"uid":2089373,"nickName":"乾坤","avatar":"http://img.kaolafm.net/mz/images/201510/8206f83b-acfa-4275-8c59-7ecc35060c24/default.jpg","likedNum":0,"isVanchor":1,"gender":0,"liveStatus":0,"recommendReson":"易学泰斗乾坤","extraAttributes":"","relation":0,"fansCount":230,"desc":"TA懒懒的什么也没写"},{"uid":2087609,"nickName":"文章","avatar":"http://img.kaolafm.net/mz/images/201601/9234f5ae-22e9-4b57-9851-1ea63aad2936/default.jpg","likedNum":0,"isVanchor":0,"gender":0,"liveStatus":0,"recommendReson":"热辣男主播文章","extraAttributes":"","relation":0,"fansCount":88,"desc":"TA懒懒的什么也没写"},{"uid":2066137,"nickName":"蜜雪儿说星事","avatar":"http://img.kaolafm.net/mz/images/201510/a31eb79a-d258-4554-a89c-ece720d76bfc/default.jpg","likedNum":2826791,"isVanchor":1,"gender":1,"liveStatus":0,"recommendReson":"","extraAttributes":"","relation":0,"fansCount":496,"desc":"主播里占星最强的，占星师里最会主播的\r\n想探索关于自己的星座秘密吗？快来听我的直播吧，好玩又有料哦！"}]},{"id":306,"name":"亲子主播","icon":"","desc":"","hasmore":1,"moreType":6,"componentType":26,"contentType":4,"relatedValue":"id=201&type=2&sorttype=","pic":"","contentSourceId":6,"count":0,"dataList":[{"uid":2663767,"nickName":"DJ易丹","avatar":"http://img.kaolafm.net/mz/images/201604/e33b230e-5e02-47fc-b020-8ea41252bbcd/default.jpg","likedNum":0,"isVanchor":0,"gender":1,"liveStatus":0,"recommendReson":"孩子们最爱的女主播","extraAttributes":"","relation":0,"fansCount":122,"desc":"她的声音让你感觉平静~"},{"uid":2065766,"nickName":"兔小贝","avatar":"http://img.kaolafm.net/mz/images/201604/eed75998-2e37-4e9f-a520-eabb7c0bd104/default.jpg","likedNum":0,"isVanchor":0,"gender":0,"liveStatus":0,"recommendReson":"儿童故事主播","extraAttributes":"","relation":0,"fansCount":174,"desc":"上万首儿歌金曲让宝宝的耳朵快乐起来。兔小贝儿歌精心推出儿歌视频大全连续播放专题，这个专题将不断为您呈现好看好玩又好听的精品儿歌。聆听一段故事，送你一个美好心情。兔小贝故事为您呈现最经典的儿童故事大全，内容涵盖经典童话故事，睡前故事，故事大全，寓言故事等；为孩子打造一个美好健康的故事世界。"},{"uid":2102332,"nickName":"凯叔讲故事","avatar":"http://img.kaolafm.net/mz/images/201709/8af63a84-3838-4c4a-9fb8-c1256c06e223/default.jpg","likedNum":0,"isVanchor":1,"gender":0,"liveStatus":0,"recommendReson":"给孩子们讲故事","extraAttributes":"","relation":0,"fansCount":317,"desc":"优质儿童故事自媒体平台。由著名主持人，两个女儿的父亲光头王凯创立。两天一次优质儿童绘本故事推送，每天一篇经典育儿文章推荐，更多互动活动为宝贝提供展示平台，帮助宝贝塑造健康的人格，和孩子一起成长。\r\n凯叔讲故事微信公众号：kaishujianggushi"}]},{"id":307,"name":"社科历史主播","icon":"","desc":"","hasmore":1,"moreType":6,"componentType":26,"contentType":4,"relatedValue":"id=657&type=2&sorttype=","pic":"","contentSourceId":6,"count":0,"dataList":[{"uid":2196166,"nickName":"石无忌惮脱口秀","avatar":"http://img.kaolafm.net/mz/images/201510/1b65d0d1-5226-4695-8c46-0915e25292d7/default.jpg","likedNum":0,"isVanchor":0,"gender":0,"liveStatus":0,"recommendReson":"成熟男声","extraAttributes":"","relation":0,"fansCount":342,"desc":"TA懒懒的什么也没写"},{"uid":2317101,"nickName":"梓棣1221","avatar":"http://img.kaolafm.net/mz/images/201511/0b3febb3-c174-4224-9975-ce9b6a0e15f0/default.jpg","likedNum":0,"isVanchor":1,"gender":3,"liveStatus":0,"recommendReson":"完美男声解读历史","extraAttributes":"","relation":0,"fansCount":20,"desc":"TA懒懒的什么也没写"},{"uid":2407930,"nickName":"大京读书","avatar":"http://img.kaolafm.net/mz/images/201601/19c6468b-b74d-4d04-8009-f013c3ca6b17/default.jpg","likedNum":0,"isVanchor":0,"gender":3,"liveStatus":0,"recommendReson":"每天一段历史","extraAttributes":"","relation":0,"fansCount":73,"desc":"TA懒懒的什么也没写"}]},{"id":308,"name":"军事主播","icon":"","desc":"","hasmore":1,"moreType":6,"componentType":26,"contentType":4,"relatedValue":"id=1165&type=2&sorttype=","pic":"","contentSourceId":6,"count":0,"dataList":[{"uid":2095270,"nickName":"舒奕","avatar":"http://img.kaolafm.net/mz/images/201602/47e99f95-116b-4a62-a037-b6eefa61749e/default.png","likedNum":0,"isVanchor":1,"gender":2,"liveStatus":0,"recommendReson":"各种有料","extraAttributes":"","relation":0,"fansCount":381,"desc":"舒奕工作室负责人"},{"uid":2577847,"nickName":"田柳探营","avatar":"http://img.kaolafm.net/mz/images/201603/fbc9dcc1-84f0-4a05-8480-f291a60677fc/default.jpg","likedNum":0,"isVanchor":0,"gender":3,"liveStatus":0,"recommendReson":"军事女主播","extraAttributes":"","relation":0,"fansCount":164,"desc":"江苏广电首席记者、著名军事记者"},{"uid":2094468,"nickName":"石磊","avatar":"http://img.kaolafm.net/mz/images/201701/925bcd9c-da12-411e-b816-f114bff60f4e/default.jpg","likedNum":0,"isVanchor":0,"gender":0,"liveStatus":0,"recommendReson":"鲜肉男主播","extraAttributes":"","relation":0,"fansCount":61,"desc":"中国华艺广播公司新闻主播。"}]},{"id":309,"name":"体育主播","icon":"","desc":"","hasmore":1,"moreType":6,"componentType":26,"contentType":4,"relatedValue":"id=18&type=2&sorttype=","pic":"","contentSourceId":6,"count":0,"dataList":[{"uid":2065554,"nickName":"健人贱语","avatar":"http://img.kaolafm.net/mz/images/201510/6bf0eb06-304a-4fca-8769-f02e7c39bbd0/default.jpg","likedNum":0,"isVanchor":0,"gender":1,"liveStatus":0,"recommendReson":"健身指导类脱口秀","extraAttributes":"","relation":0,"fansCount":84,"desc":"TA懒懒的什么也没写"},{"uid":2062323,"nickName":"聊个球播客","avatar":"http://img.kaolafm.net/mz/images/201510/b04d8408-f567-47b8-92a0-10f981ac4522/default.jpg","likedNum":0,"isVanchor":0,"gender":3,"liveStatus":0,"recommendReson":"最好的中文体育播客","extraAttributes":"","relation":0,"fansCount":36,"desc":"TA懒懒的什么也没写"},{"uid":2214275,"nickName":"趣骑电台","avatar":"http://img.kaolafm.net/mz/images/201605/4e96d2d5-c22a-43ef-b83f-e3fedf5d38bc/default.jpg","likedNum":62326,"isVanchor":1,"gender":1,"liveStatus":0,"recommendReson":"趣骑电台","extraAttributes":"","relation":0,"fansCount":42,"desc":"第一档专注于骑行的电台  分享骑行音乐、骑行趣闻、车坛动态、骑友交流。【微信公众号：趣骑电台】\r\n"}]},{"id":310,"name":"汽车主播","icon":"","desc":"","hasmore":1,"moreType":6,"componentType":26,"contentType":4,"relatedValue":"id=662&type=2&sorttype=","pic":"","contentSourceId":6,"count":0,"dataList":[{"uid":2615673,"nickName":"新浪汽车","avatar":"http://img.kaolafm.net/mz/images/201603/e8192ca2-dec7-4d77-90ff-b9075a4b231b/default.jpg","likedNum":4414,"isVanchor":0,"gender":0,"liveStatus":0,"recommendReson":"新浪汽车官方认证","extraAttributes":"","relation":0,"fansCount":474,"desc":"新浪汽车原创节目《胖哥试车》，胖哥杨力以客观专业的态度、通俗幽默的语言告诉你每辆车的试驾感受。"},{"uid":2269731,"nickName":"二手车小胖说","avatar":"http://img.kaolafm.net/mz/images/201510/064e1e06-9997-49f9-8bb7-c550d825f3d4/default.png","likedNum":0,"isVanchor":0,"gender":0,"liveStatus":0,"recommendReson":"纵论车坛风云","extraAttributes":"","relation":0,"fansCount":136,"desc":"纵论车坛风云，评说世间百态"},{"uid":2065630,"nickName":"备胎说车","avatar":"http://img.kaolafm.net/mz/images/201510/a4d11ca9-4fd2-4cbb-bb76-0f2e8e82708d/default.jpg","likedNum":0,"isVanchor":0,"gender":0,"liveStatus":0,"recommendReson":"说遍汽车圈","extraAttributes":"","relation":0,"fansCount":91,"desc":"微信公众号：备胎说车，汽车知识小干货，逼格提升小手册，交朋友，搞活动，哪里只是车。"}]},{"id":311,"name":"广播剧主播","icon":"","desc":"","hasmore":1,"moreType":6,"componentType":26,"contentType":4,"relatedValue":"id=819&type=2&sorttype=","pic":"","contentSourceId":6,"count":0,"dataList":[{"uid":3092403,"nickName":"绘音配音","avatar":"http://img.kaolafm.net/mz/images/201608/dde72bf0-8665-4aea-b2a1-8c4790bece09/default.jpg","likedNum":0,"isVanchor":0,"gender":3,"liveStatus":0,"recommendReson":"绘斑斓音，描素朴韵","extraAttributes":"","relation":0,"fansCount":85,"desc":"绘斑斓之音，描素朴之韵。网络配音社团，绘音配音社，绘音配音粉丝群 326105152 欢迎大家前来交【催】流【剧】"},{"uid":2159743,"nickName":"45摄氏度工作室","avatar":"http://img.kaolafm.net/mz/images/201510/4d48103c-0609-40a3-ae4a-ef91e81c2efc/default.jpg","likedNum":0,"isVanchor":0,"gender":1,"liveStatus":0,"recommendReson":"出品全类型广播剧","extraAttributes":"","relation":0,"fansCount":36,"desc":"作品涉及古风、架空、历史、穿越、耽美、同人、言情、玄幻、魔幻、百合等。自工作室成立以来，我们不断挑战自我，致力制作优质广播剧，敬请期待。\r\n\r\n45℃工作室交流群 398381940    歪歪：89859660 官方微博： @45摄氏度工作室 5sing：http://5sing.kugou.com/37362008/default.html"},{"uid":2562500,"nickName":"筱子寒丶","avatar":"http://img.kaolafm.net/mz/images/201709/ee1f8309-10e1-4700-9538-b9f22cec207e/default.png","likedNum":14463,"isVanchor":1,"gender":3,"liveStatus":0,"recommendReson":"","extraAttributes":"","relation":0,"fansCount":231,"desc":"首先，谢谢大家一年多来对我的关心，也感谢你们对上瘾这部作品的喜欢与支持。关于上瘾，第一卷已经完结，第二卷也已经更新，大家从我的主页可以看到。此外，还建立了一些新的电台专辑，欢迎收听\r\n\r\nQQ听众群：109457785 个人WX：DJxiaozihan"}]},{"id":312,"name":"电视影音主播","icon":"","desc":"","hasmore":1,"moreType":6,"componentType":26,"contentType":4,"relatedValue":"id=200&type=2&sorttype=","pic":"","contentSourceId":6,"count":0,"dataList":[{"uid":2586902,"nickName":"逗逼星辰","avatar":"http://img.kaolafm.net/mz/images/201603/3769e77d-bbeb-42c1-9fca-8d6558ff6c85/default.jpg","likedNum":0,"isVanchor":0,"gender":3,"liveStatus":0,"recommendReson":"大叔萝莉陪你侃剧","extraAttributes":"","relation":0,"fansCount":36,"desc":"TA懒懒的什么也没写"},{"uid":2060446,"nickName":"冰糖电影","avatar":"http://img.kaolafm.net/mz/images/201510/1a3dcbdb-1b27-4bd5-bd41-3899735445be/default.jpg","likedNum":0,"isVanchor":0,"gender":1,"liveStatus":0,"recommendReson":"冰糖电影","extraAttributes":"","relation":0,"fansCount":69,"desc":"影院有风险，观影需谨慎。听冰糖电影，有效躲避烂片。"},{"uid":2055423,"nickName":"电影不无聊","avatar":"http://img.kaolafm.net/mz/images/201510/dab94515-534a-4b18-88ea-ac7917b70a18/default.jpg","likedNum":0,"isVanchor":0,"gender":0,"liveStatus":0,"recommendReson":"逗比胡侃电影主播","extraAttributes":"","relation":0,"fansCount":67,"desc":"TA懒懒的什么也没写"}]},{"id":313,"name":"恐怖故事主播","icon":"","desc":"","hasmore":1,"moreType":6,"componentType":26,"contentType":4,"relatedValue":"id=664&type=2&sorttype=","pic":"","contentSourceId":6,"count":0,"dataList":[{"uid":2210567,"nickName":"王严肃","avatar":"http://img.kaolafm.net/mz/images/201510/1668bb9e-2e9e-4cdd-b7d8-4fb2ce12b8a1/default.jpg","likedNum":0,"isVanchor":0,"gender":0,"liveStatus":0,"recommendReson":"严肃地讲鬼故事","extraAttributes":"","relation":0,"fansCount":90,"desc":"TA懒懒的什么也没写"},{"uid":1015105,"nickName":"小胆","avatar":"http://img.kaolafm.net/mz/images/201512/ca6222c7-a3ea-43bd-9d52-a06b41a81dde/default.jpg","likedNum":1542605,"isVanchor":1,"gender":0,"liveStatus":0,"recommendReson":"讲起鬼来自己都害怕","extraAttributes":"","relation":0,"fansCount":6233,"desc":"微信搜索：cxm364899996 关注小胆"},{"uid":2353165,"nickName":"晓明哥","avatar":"http://img.kaolafm.net/mz/images/201512/4efddb42-523e-4056-a991-84ef3b573e6e/default.jpg","likedNum":0,"isVanchor":0,"gender":0,"liveStatus":0,"recommendReson":"灵异圈的小明哥","extraAttributes":"","relation":0,"fansCount":131,"desc":"鬼故事太假，要听就听晓明哥的《灵异在线》 欢迎大家来yy现场听 ID:25103 每晚21：00-22：30真实的灵异事件 敢来吗?蜻蜓 每晚23：00-0：00直播《中国灵异事件》"}]},{"id":314,"name":"动漫游戏主播","icon":"","desc":"","hasmore":1,"moreType":6,"componentType":26,"contentType":4,"relatedValue":"id=1251&type=2&sorttype=","pic":"","contentSourceId":6,"count":0,"dataList":[{"uid":2066235,"nickName":"宇宙映画COSMO","avatar":"http://img.kaolafm.net/mz/images/201510/ce0f04e4-2008-4534-8323-4c03327d9636/default.png","likedNum":0,"isVanchor":0,"gender":1,"liveStatus":0,"recommendReson":"二次元最萌CP","extraAttributes":"","relation":0,"fansCount":6,"desc":"TA懒懒的什么也没写"},{"uid":2905085,"nickName":"娱子酱","avatar":"http://img.kaolafm.net/mz/images/201610/05246b23-9e75-4d48-b8ed-b317f88f7ce1/default.jpg","likedNum":0,"isVanchor":0,"gender":3,"liveStatus":0,"recommendReson":"更萌更搞更八卦","extraAttributes":"","relation":0,"fansCount":2,"desc":"泛二次元娱乐资讯站，看动漫，打游戏！微博@娱子酱官微"},{"uid":4168954,"nickName":"游戏时光VGtime","avatar":"http://img.kaolafm.net/mz/images/201705/9212c269-b3a6-4182-a55b-9b7a10265ba8/default.jpg","likedNum":0,"isVanchor":1,"gender":3,"liveStatus":0,"recommendReson":"御宅少年游戏狂","extraAttributes":"","relation":0,"fansCount":15,"desc":"欢迎收听来自游戏时光VGtime的电台节目。笑谈游戏和生活，分享最美好的游戏时光。"}]},{"id":315,"name":"教育主播","icon":"","desc":"","hasmore":1,"moreType":1,"componentType":26,"contentType":4,"relatedValue":"1","pic":"","contentSourceId":6,"count":0,"dataList":[{"uid":2597828,"nickName":"创业黑马学院","avatar":"http://img.kaolafm.net/mz/images/201603/0a5f4b37-3dff-4ed2-9f89-c4c0665185d4/default.jpg","likedNum":0,"isVanchor":0,"gender":0,"liveStatus":0,"recommendReson":"磁性女音","extraAttributes":"","relation":0,"fansCount":98,"desc":"来自创投圈最前沿的内部分享、黑马营收费课程，创业黑马学院播出授权。 \r\n关于黑马营的课程，你可能没有办法全部参与，但是在这里你可以听到很多往期的内部分享哦，您也可以关注【创业黑马学院】的微信公共账号，每天都能收到最新鲜的课后资料哦。"},{"uid":2513838,"nickName":"找理财网微课堂","avatar":"http://img.kaolafm.net/mz/images/201602/2f84f82c-10c1-439e-ab7b-2ddcdaa7707e/default.jpg","likedNum":45453,"isVanchor":0,"gender":1,"liveStatus":0,"recommendReson":"","extraAttributes":"","relation":0,"fansCount":105,"desc":"找理财网微课堂，旨在为大家提供一个交流学习互金知识，结交各方人脉的在线分享平台。"},{"uid":2059804,"nickName":"一席","avatar":"http://img.kaolafm.net/mz/images/201510/f555ee08-c6fe-4610-8e9b-559d1ace3af9/default.jpg","likedNum":0,"isVanchor":1,"gender":0,"liveStatus":0,"recommendReson":"听好话 涨姿势","extraAttributes":"","relation":0,"fansCount":87,"desc":"TA懒懒的什么也没写"}]},{"id":316,"name":"生活主播","icon":"","desc":"","hasmore":1,"moreType":6,"componentType":26,"contentType":4,"relatedValue":"id=21&type=2&sorttype=","pic":"","contentSourceId":6,"count":0,"dataList":[{"uid":2052752,"nickName":"小杰FM","avatar":"http://img.kaolafm.net/mz/images/201512/0669e4b7-413b-408c-8600-b15e2dc856a7/default.jpg","likedNum":12467,"isVanchor":1,"gender":1,"liveStatus":0,"recommendReson":"世界真奇妙","extraAttributes":"","relation":0,"fansCount":288,"desc":"TA懒懒的什么也没写"},{"uid":2319730,"nickName":"猫火火","avatar":"http://img.kaolafm.net/mz/images/201601/bcc8e44f-7017-458b-b26e-7089a576178b/default.jpg","likedNum":44,"isVanchor":1,"gender":1,"liveStatus":0,"recommendReson":"火言火语","extraAttributes":"","relation":0,"fansCount":25,"desc":"环球旅行家，绘本插画师，签约摄影！然后其实是一个说话很逗比的东北姑娘！"},{"uid":2605141,"nickName":"小蜗佳佳","avatar":"http://img.kaolafm.net/mz/images/201605/a2c57868-9a2a-4a14-b502-b3c27e08d4c3/default.jpg","likedNum":0,"isVanchor":1,"gender":1,"liveStatus":0,"recommendReson":"萝莉陪你去旅行","extraAttributes":"","relation":0,"fansCount":79,"desc":"声音的世界里，你我的相遇，是一段奇妙的音符。欢迎把的故事通过文字告诉我发送247815400@qq.com"}]},{"id":317,"name":"健康主播","icon":"","desc":"","hasmore":1,"moreType":6,"componentType":26,"contentType":4,"relatedValue":"id=1241&type=2&sorttype=","pic":"","contentSourceId":6,"count":0,"dataList":[{"uid":2065554,"nickName":"健人贱语","avatar":"http://img.kaolafm.net/mz/images/201510/6bf0eb06-304a-4fca-8769-f02e7c39bbd0/default.jpg","likedNum":0,"isVanchor":0,"gender":1,"liveStatus":0,"recommendReson":"健身指导类脱口秀","extraAttributes":"","relation":0,"fansCount":84,"desc":"TA懒懒的什么也没写"},{"uid":2940880,"nickName":"美少妈","avatar":"http://img.kaolafm.net/mz/images/201606/142d23f4-8c70-4e57-8093-c1c896142c85/default.jpg","likedNum":0,"isVanchor":1,"gender":1,"liveStatus":0,"recommendReson":"用声音烹饪美食","extraAttributes":"","relation":0,"fansCount":165,"desc":"我是美少妈，喜欢烹饪、码字、播音的你成为朋友，可以加微信：18268649601"},{"uid":2430678,"nickName":"DJ雨锋","avatar":"http://img.kaolafm.net/mz/images/201601/1b09ab58-3632-4466-8022-19aa29e415c4/default.png","likedNum":0,"isVanchor":1,"gender":3,"liveStatus":0,"recommendReson":"让你卸下心防","extraAttributes":"","relation":0,"fansCount":76,"desc":"原浙江省舟山市广播电视总台FM91汽车音乐调频及FM97交通经济广播节目主持人；现安徽省六安市舒城广播电视台FM98.6交通音乐广播总监"}]},{"id":318,"name":"校园主播","icon":"","desc":"","hasmore":1,"moreType":6,"componentType":26,"contentType":4,"relatedValue":"id=1242&type=2&sorttype=","pic":"","contentSourceId":6,"count":0,"dataList":[]},{"id":323,"name":"治愈系主播","icon":"","desc":"","hasmore":1,"moreType":6,"componentType":26,"contentType":4,"relatedValue":"id=713&type=2&sorttype=","pic":"","contentSourceId":6,"count":0,"dataList":[{"uid":2147888,"nickName":"寒霜之声","avatar":"http://img.kaolafm.net/mz/images/201510/864a69b4-260f-4c8c-94e4-506f40b2299e/default.png","likedNum":0,"isVanchor":0,"gender":3,"liveStatus":0,"recommendReson":"温暖女声治愈心灵","extraAttributes":"","relation":0,"fansCount":1001,"desc":"TA懒懒的什么也没写"},{"uid":2088778,"nickName":"程一电台","avatar":"http://img.kaolafm.net/mz/images/201510/1c1226ac-ca8a-40d7-8aff-50812ed7418a/default.jpg","likedNum":0,"isVanchor":1,"gender":0,"liveStatus":0,"recommendReson":"微博签约自媒体人","extraAttributes":"","relation":0,"fansCount":4307,"desc":"睡前一段优美文字，一首暖心歌曲。声音是有温度的，夜晚的声音会发光。新浪微博DJ程一，微信公众号djchengyi。感谢各位的支持。 "},{"uid":2162948,"nickName":"蕊希Erin","avatar":"http://img.kaolafm.net/mz/images/201605/2bf7456f-80ca-48a4-bf9b-6a9a23392214/default.jpg","likedNum":0,"isVanchor":0,"gender":1,"liveStatus":0,"recommendReson":"清新女声抚平伤痕","extraAttributes":"","relation":0,"fansCount":3046,"desc":"素未谋面，谢谢你，愿意听我。【微博：蕊希Erin  微信公众号：一个人听（yigerenting179）】"}]}]}
     * serverTime : 1507522127071
     */

    private String code;
    private String message;
    private ResultBean result;
    private long serverTime;

    public static WholeBean objectFromData(String str) {

        return new Gson().fromJson(str, WholeBean.class);
    }

    public static WholeBean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(key), WholeBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<WholeBean> arrayWholeBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<WholeBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<WholeBean> arrayWholeBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<WholeBean>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(key), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public long getServerTime() {
        return serverTime;
    }

    public void setServerTime(long serverTime) {
        this.serverTime = serverTime;
    }

    public static class ResultBean {
        private List<DataListBeanX> dataList;

        public static ResultBean objectFromData(String str) {

            return new Gson().fromJson(str, ResultBean.class);
        }

        public static ResultBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(key), ResultBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public static List<ResultBean> arrayResultBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<ResultBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public static List<ResultBean> arrayResultBeanFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new TypeToken<ArrayList<ResultBean>>() {
                }.getType();

                return new Gson().fromJson(jsonObject.getString(key), listType);

            } catch (JSONException e) {
                e.printStackTrace();
            }

            return new ArrayList();


        }

        public List<DataListBeanX> getDataList() {
            return dataList;
        }

        public void setDataList(List<DataListBeanX> dataList) {
            this.dataList = dataList;
        }

        public static class DataListBeanX {
            /**
             * id : 254
             * name : 轮播图
             * icon :
             * desc :
             * hasmore : 1
             * moreType : 3
             * componentType : 1
             * contentType : 1
             * relatedValue : -1
             * pic :
             * contentSourceId : 6
             * count : 0
             * dataList : [{"rid":2091640,"rtype":13,"rname":"仨贱客","pic":"http://img.kaolafm.net/mz/images/201704/64dca3a5-b934-4cd2-95eb-f5fd3cac3735/default.jpg","weburl":"","des":"仨贱客","albumName":"","albumId":-1,"num":0,"host":[],"mp3PlayUrl":"","cornerMark":0,"rvalue":"2091640","tip":"","followedNum":0,"listenNum":0,"area":null,"reportUrl":[],"expoUrl":[],"adType":-1,"adUserId":"","adId":"","dataReport":"仨贱客","dataList":[],"isSubscribe":0,"callback":null},{"rid":1300000001347,"rtype":2,"rname":"治愈良药：十大金牌段子王","pic":"http://img.kaolafm.net/mz/images/201706/332e710f-ac02-4897-a357-fa20ec172611/default.jpg","weburl":"http://m.kaolafm.com/client/special/1300000001347.html?id=1300000001347&type=6","des":"治愈良药：十大金牌段子王","albumName":"","albumId":-1,"num":0,"host":[],"mp3PlayUrl":"","cornerMark":0,"rvalue":"http://m.kaolafm.com/client/special/1300000001347.html?id=1300000001347&type=6","tip":"","followedNum":0,"listenNum":0,"area":null,"reportUrl":[],"expoUrl":[],"adType":-1,"adUserId":"","adId":"","dataReport":"治愈良药：十大金牌段子王","dataList":[],"isSubscribe":0,"callback":null},{"rid":1300000001354,"rtype":2,"rname":"观点大本营 思想兵工厂","pic":"http://img.kaolafm.net/mz/images/201706/8191906a-3187-4f4e-8afe-5d48cf9860e8/default.jpg","weburl":"http://m.kaolafm.com/client/special/1300000001354.html?id=1300000001354&type=6","des":"每天新闻这么多，听听大家怎么说！这里汇集最及时的热辣新闻、最精辟的独到分析和最动人的故事！","albumName":"","albumId":-1,"num":0,"host":[],"mp3PlayUrl":"","cornerMark":0,"rvalue":"http://m.kaolafm.com/client/special/1300000001354.html?id=1300000001354&type=6","tip":"","followedNum":0,"listenNum":0,"area":null,"reportUrl":[],"expoUrl":[],"adType":-1,"adUserId":"","adId":"","dataReport":"观点大本营 思想兵工厂","dataList":[],"isSubscribe":0,"callback":null},{"rid":1300000001508,"rtype":2,"rname":"考拉金牌主播：用声音，带你去旅行","pic":"http://img.kaolafm.net/mz/images/201706/087147c4-7d40-425f-b14b-67479c0f61f6/default.jpg","weburl":"http://m.kaolafm.com/client/special/1300000001508.html?id=1300000001508&type=6","des":"考拉好声音，你值得拥有","albumName":"","albumId":-1,"num":0,"host":[],"mp3PlayUrl":"","cornerMark":0,"rvalue":"http://m.kaolafm.com/client/special/1300000001508.html?id=1300000001508&type=6","tip":"","followedNum":0,"listenNum":0,"area":null,"reportUrl":[],"expoUrl":[],"adType":-1,"adUserId":"","adId":"","dataReport":"考拉金牌主播：用声音，带你去旅行","dataList":[],"isSubscribe":0,"callback":null},{"rid":1300000001344,"rtype":2,"rname":"股民福音！股市行家抱团来袭！","pic":"http://img.kaolafm.net/mz/images/201706/de2e8673-ec9e-41fc-93f1-6821112600c4/default.jpg","weburl":"http://m.kaolafm.com/client/special/1300000001344.html?id=1300000001344&type=6","des":"作为一个中国股民，必须经得住涨停的狂喜，顶得住跌停的悲怆，套得住隐藏的黑马，爱得起波动的大盘。哎，你手中个股涨还是跌，如何把握机会？憋着急！考拉君为你准备了最专业的股市行情早晚评，跟股市达人一起成长！","albumName":"","albumId":-1,"num":0,"host":[],"mp3PlayUrl":"","cornerMark":0,"rvalue":"http://m.kaolafm.com/client/special/1300000001344.html?id=1300000001344&type=6","tip":"","followedNum":0,"listenNum":0,"area":null,"reportUrl":[],"expoUrl":[],"adType":-1,"adUserId":"","adId":"","dataReport":"股民福音！股市行家抱团来袭！","dataList":[],"isSubscribe":0,"callback":null}]
             */

            private int id;
            private String name;
            private String icon;
            private String desc;
            private int hasmore;
            private int moreType;
            private int componentType;
            private int contentType;
            private String relatedValue;
            private String pic;
            private int contentSourceId;
            private int count;
            private List<DataListBean> dataList;

            public static DataListBeanX objectFromData(String str) {

                return new Gson().fromJson(str, DataListBeanX.class);
            }

            public static DataListBeanX objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(key), DataListBeanX.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<DataListBeanX> arrayDataListBeanXFromData(String str) {

                Type listType = new TypeToken<ArrayList<DataListBeanX>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<DataListBeanX> arrayDataListBeanXFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<DataListBeanX>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(key), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public int getHasmore() {
                return hasmore;
            }

            public void setHasmore(int hasmore) {
                this.hasmore = hasmore;
            }

            public int getMoreType() {
                return moreType;
            }

            public void setMoreType(int moreType) {
                this.moreType = moreType;
            }

            public int getComponentType() {
                return componentType;
            }

            public void setComponentType(int componentType) {
                this.componentType = componentType;
            }

            public int getContentType() {
                return contentType;
            }

            public void setContentType(int contentType) {
                this.contentType = contentType;
            }

            public String getRelatedValue() {
                return relatedValue;
            }

            public void setRelatedValue(String relatedValue) {
                this.relatedValue = relatedValue;
            }

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }

            public int getContentSourceId() {
                return contentSourceId;
            }

            public void setContentSourceId(int contentSourceId) {
                this.contentSourceId = contentSourceId;
            }

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }

            public List<DataListBean> getDataList() {
                return dataList;
            }

            public void setDataList(List<DataListBean> dataList) {
                this.dataList = dataList;
            }

            public static class DataListBean {
                /**
                 * rid : 2091640
                 * rtype : 13
                 * rname : 仨贱客
                 * pic : http://img.kaolafm.net/mz/images/201704/64dca3a5-b934-4cd2-95eb-f5fd3cac3735/default.jpg
                 * weburl :
                 * des : 仨贱客
                 * albumName :
                 * albumId : -1
                 * num : 0
                 * host : []
                 * mp3PlayUrl :
                 * cornerMark : 0
                 * rvalue : 2091640
                 * tip :
                 * followedNum : 0
                 * listenNum : 0
                 * area : null
                 * reportUrl : []
                 * expoUrl : []
                 * adType : -1
                 * adUserId :
                 * adId :
                 * dataReport : 仨贱客
                 * dataList : []
                 * isSubscribe : 0
                 * callback : null
                 */

                private int rid;
                private int rtype;
                private String rname;
                private String pic;
                private String weburl;
                private String des;
                private String albumName;
                private int albumId;
                private int num;
                private String mp3PlayUrl;
                private int cornerMark;
                private String rvalue;
                private String tip;
                private int followedNum;
                private int listenNum;
                private Object area;
                private int adType;
                private String adUserId;
                private String adId;
                private String dataReport;
                private int isSubscribe;
                private Object callback;
                private List<?> host;
                private List<?> reportUrl;
                private List<?> expoUrl;
                private List<?> dataList;

                public static DataListBean objectFromData(String str) {

                    return new Gson().fromJson(str, DataListBean.class);
                }

                public static DataListBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new Gson().fromJson(jsonObject.getString(key), DataListBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public static List<DataListBean> arrayDataListBeanFromData(String str) {

                    Type listType = new TypeToken<ArrayList<DataListBean>>() {
                    }.getType();

                    return new Gson().fromJson(str, listType);
                }

                public static List<DataListBean> arrayDataListBeanFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new TypeToken<ArrayList<DataListBean>>() {
                        }.getType();

                        return new Gson().fromJson(jsonObject.getString(key), listType);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return new ArrayList();


                }

                public int getRid() {
                    return rid;
                }

                public void setRid(int rid) {
                    this.rid = rid;
                }

                public int getRtype() {
                    return rtype;
                }

                public void setRtype(int rtype) {
                    this.rtype = rtype;
                }

                public String getRname() {
                    return rname;
                }

                public void setRname(String rname) {
                    this.rname = rname;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public String getWeburl() {
                    return weburl;
                }

                public void setWeburl(String weburl) {
                    this.weburl = weburl;
                }

                public String getDes() {
                    return des;
                }

                public void setDes(String des) {
                    this.des = des;
                }

                public String getAlbumName() {
                    return albumName;
                }

                public void setAlbumName(String albumName) {
                    this.albumName = albumName;
                }

                public int getAlbumId() {
                    return albumId;
                }

                public void setAlbumId(int albumId) {
                    this.albumId = albumId;
                }

                public int getNum() {
                    return num;
                }

                public void setNum(int num) {
                    this.num = num;
                }

                public String getMp3PlayUrl() {
                    return mp3PlayUrl;
                }

                public void setMp3PlayUrl(String mp3PlayUrl) {
                    this.mp3PlayUrl = mp3PlayUrl;
                }

                public int getCornerMark() {
                    return cornerMark;
                }

                public void setCornerMark(int cornerMark) {
                    this.cornerMark = cornerMark;
                }

                public String getRvalue() {
                    return rvalue;
                }

                public void setRvalue(String rvalue) {
                    this.rvalue = rvalue;
                }

                public String getTip() {
                    return tip;
                }

                public void setTip(String tip) {
                    this.tip = tip;
                }

                public int getFollowedNum() {
                    return followedNum;
                }

                public void setFollowedNum(int followedNum) {
                    this.followedNum = followedNum;
                }

                public int getListenNum() {
                    return listenNum;
                }

                public void setListenNum(int listenNum) {
                    this.listenNum = listenNum;
                }

                public Object getArea() {
                    return area;
                }

                public void setArea(Object area) {
                    this.area = area;
                }

                public int getAdType() {
                    return adType;
                }

                public void setAdType(int adType) {
                    this.adType = adType;
                }

                public String getAdUserId() {
                    return adUserId;
                }

                public void setAdUserId(String adUserId) {
                    this.adUserId = adUserId;
                }

                public String getAdId() {
                    return adId;
                }

                public void setAdId(String adId) {
                    this.adId = adId;
                }

                public String getDataReport() {
                    return dataReport;
                }

                public void setDataReport(String dataReport) {
                    this.dataReport = dataReport;
                }

                public int getIsSubscribe() {
                    return isSubscribe;
                }

                public void setIsSubscribe(int isSubscribe) {
                    this.isSubscribe = isSubscribe;
                }

                public Object getCallback() {
                    return callback;
                }

                public void setCallback(Object callback) {
                    this.callback = callback;
                }

                public List<?> getHost() {
                    return host;
                }

                public void setHost(List<?> host) {
                    this.host = host;
                }

                public List<?> getReportUrl() {
                    return reportUrl;
                }

                public void setReportUrl(List<?> reportUrl) {
                    this.reportUrl = reportUrl;
                }

                public List<?> getExpoUrl() {
                    return expoUrl;
                }

                public void setExpoUrl(List<?> expoUrl) {
                    this.expoUrl = expoUrl;
                }

                public List<?> getDataList() {
                    return dataList;
                }

                public void setDataList(List<?> dataList) {
                    this.dataList = dataList;
                }
            }
        }
    }
}
