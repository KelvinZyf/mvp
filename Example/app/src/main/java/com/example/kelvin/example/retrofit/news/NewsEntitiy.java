package com.example.kelvin.example.retrofit.news;

import java.util.List;

/**
 * Created by kelvin on 2017/5/10.
 */

public class NewsEntitiy {

    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"uniquekey":"baa3bccaaeebaba2bac7c1ee71cd931f","title":"云南监狱逃犯张林苍出逃9天被抓获","date":"2017-05-10 12:54","category":"头条","author_name":"国际在线","url":"http://mini.eastday.com/mobile/170510125400228.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170510/20170510125400_7ee863abf3bd621ef9b42ff7a8c5f9d0_3_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170510/20170510125400_40a8879ccf593e7ccc4b1c525b020775_1_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170510/20170510125400_119b7590a13129309873c7f09c7e8951_2_mwpm_03200403.jpeg"},{"uniquekey":"7b863eeaf7f0c557e4f31d0578b285d2","title":"武汉大熊猫鼻头变白疑场馆环境差所致 园方回应","date":"2017-05-10 13:20","category":"头条","author_name":"封面新闻","url":"http://mini.eastday.com/mobile/170510132021017.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170510/20170510132021_d1c8870caa1e0a8876503776a3c499df_1_mwpm_03200403.png","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170510/20170510132021_d1c8870caa1e0a8876503776a3c499df_2_mwpm_03200403.png"},{"uniquekey":"490c0a3328031d8d7f3b27c979a83c3a","title":"文在寅就职演讲：不在青瓦台办公，将与中美磋商萨德问题","date":"2017-05-10 13:17","category":"头条","author_name":"澎湃新闻","url":"http://mini.eastday.com/mobile/170510131706474.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170510/20170510131706_3906fa56bc131cc57d4eea24735e7fc2_1_mwpm_03200403.jpeg"},{"uniquekey":"ab0ed2d8aab4e6fc2dda52049a13f2dd","title":"破解\u201c人难找\u201d 河南探索打击拒执犯罪新模式","date":"2017-05-10 13:12","category":"头条","author_name":"人民网-河南频道","url":"http://mini.eastday.com/mobile/170510131253394.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170510/20170510131253_6d2400ac5c458124b14d9793b750a6b2_1_mwpm_03200403.jpeg"},{"uniquekey":"eef8b47d9fd17c8672fdf8d4a7cc78a5","title":"把调查竞选团队是否通俄的FBI局长解雇后，特朗普见俄外长","date":"2017-05-10 13:06","category":"头条","author_name":"澎湃新闻","url":"http://mini.eastday.com/mobile/170510130633819.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170510/20170510130633_f134fca0b6985c5795c59084adcaeae1_1_mwpm_03200403.jpeg"},{"uniquekey":"d6a801b3eb0e3800eb50f767417ce413","title":"支付宝因违反支付业务规定 被央行上海分行罚款3万元","date":"2017-05-10 12:59","category":"头条","author_name":"中国网财经","url":"http://mini.eastday.com/mobile/170510125906399.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170510/20170510125906_01f5fc919e3d58d8487beb8699607fc4_1_mwpm_03200403.jpeg"},{"uniquekey":"a9ae4748b2a4a5d1d14b1400fdf274d4","title":"这个地方十女配一夫！沦为了最缺男人的国家","date":"2017-05-10 12:34","category":"头条","author_name":"小叶世界","url":"http://mini.eastday.com/mobile/170510123412672.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170510/20170510_eaeed071e060cfb926e29e9a0e889f20_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170510/20170510_f41f79edc2eeaad15cfd1b01767be8f8_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170510/20170510_0f88aebd3bb29c8577d2fe0823822791_cover_mwpm_03200403.jpeg"},{"uniquekey":"673b1534a55141d5d652d8810b789e7f","title":"文在寅高票当选韩国总统 今天上午将宣誓就任","date":"2017-05-10 12:33","category":"头条","author_name":"央视新闻客户端","url":"http://mini.eastday.com/mobile/170510123346439.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170510/20170510123346_d022cb0e401a425eb6aac78ce28e0a5c_5_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170510/20170510123346_d022cb0e401a425eb6aac78ce28e0a5c_4_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170510/20170510123346_d022cb0e401a425eb6aac78ce28e0a5c_1_mwpm_03200403.jpeg"},{"uniquekey":"aecc8543454335f7607a215cb602c606","title":"剑指\u201c萨德\u201d？国防部爆猛料：火箭军在渤海试射新型导弹","date":"2017-05-10 12:31","category":"头条","author_name":"东方网东方头条","url":"http://mini.eastday.com/mobile/170510123128110.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170510/20170510123128_dfb11183bad5a3ef0c6282557b80e0cf_1_mwpm_03200403.png"},{"uniquekey":"6d532eee09fc8528c34afd5997a964d1","title":"台湾海基会盼下半年能参访大陆 国台办回应","date":"2017-05-10 12:25","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170510122526013.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170510/20170510122526_843407995223ae4e7e0ada2bbce57b65_1_mwpm_03200403.jpeg"},{"uniquekey":"0d979d68d7bd2878f6eff4f6cd7856e1","title":"蔡英文用\u201c中国\u201d指称\u201c中国大陆\u201d 国台办回应","date":"2017-05-10 12:11","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170510121135152.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170510/20170510121135_22b82a7ce5164d47ed4a8e361cde4377_1_mwpm_03200403.jpeg"},{"uniquekey":"d203a88fe25512294c7e47b2755624c8","title":"央视今日发布\u201cCCTV中国品牌榜\u201d入围名单！谁会上榜？","date":"2017-05-10 11:54","category":"头条","author_name":"央视网","url":"http://mini.eastday.com/mobile/170510115437927.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170510/20170510115437_4579d870877c4c38460504cb8b93f98b_1_mwpm_03200403.jpeg"},{"uniquekey":"2a39b80b38451312572b458db349a4cb","title":"禽兽！校长性侵小学女生，致其怀孕！","date":"2017-05-10 11:52","category":"头条","author_name":"手术通","url":"http://mini.eastday.com/mobile/170510115246289.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170510/20170510_e7f8e109339fe80e535f7e734e0fd905_mwpm_03200403.png","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170510/20170510_0ca05d1a17e342483b6bb1784642a316_mwpm_03200403.png","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170510/20170510_4f511218c7cb158858fbd66567b88935_mwpm_03200403.png"},{"uniquekey":"80ac270f93e5a79d051f61f0a2269f31","title":"河南商丘市平台办事处\u201c5-7\u201d惨祸背后的拆迁利益链","date":"2017-05-10 11:49","category":"头条","author_name":"中国发展网","url":"http://mini.eastday.com/mobile/170510114929450.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170510/20170510114929_ad549589c79961748f28f1a06888bc76_3_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170510/20170510114929_ad549589c79961748f28f1a06888bc76_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170510/20170510114929_ad549589c79961748f28f1a06888bc76_1_mwpm_03200403.jpeg"},{"uniquekey":"30620ee52e241a950c7c466d607ffa7e","title":"中美军事差距到底有多大？张召忠意外揭开真相 国内一片哗然 ","date":"2017-05-10 11:45","category":"头条","author_name":"东方号","url":"http://mini.eastday.com/mobile/170510114504742.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170510/20170510114504_ea784147ed0401109d7c528c88095b1b_7_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170510/20170510114504_ea784147ed0401109d7c528c88095b1b_1_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170510/20170510114504_ea784147ed0401109d7c528c88095b1b_6_mwpm_03200403.jpeg"},{"uniquekey":"a39f9941e2cc936ecd45caeb4e28f457","title":"学不来许晴的气质就别穿同款，赵丽颖就是最好的例子，无法掩饰的尴尬","date":"2017-05-10 11:44","category":"头条","author_name":"轮花娱乐","url":"http://mini.eastday.com/mobile/170510114402916.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170510/20170510_fa9b8c793ac65cb98e68569155258f91_cover_mwpm_03200403.png","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170510/20170510_1dfdf3e7832ed03d6e5334f4996cd660_cover_mwpm_03200403.png","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170510/20170510_dbcfbef9ba4e845601af07d8176aeef4_cover_mwpm_03200403.png"},{"uniquekey":"e9a13b1848fe2d73306c9c5d10d6c1ff","title":"在野外遇到这些\u201c怪物\u201d不要恐慌不要踩，躲开就行！","date":"2017-05-10 11:41","category":"头条","author_name":"时尚情感语录","url":"http://mini.eastday.com/mobile/170510114128931.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170510/20170510_10ad1b3ca084ed422fbdf859896b14c4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170510/20170510_75af162d74cca7d17b8243df01f65191_mwpm_03200403.jpg"},{"uniquekey":"06e0c9db8ecd79f9d3e331db7d95ade6","title":"在农村，这样的女人最适合做老婆！","date":"2017-05-10 11:39","category":"头条","author_name":"小晖世界观","url":"http://mini.eastday.com/mobile/170510113907934.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170510/20170510_8ae8708088fa3404d49eb24a13a1fa35_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170510/20170510_9a6d8eb6c178c3091a4442163447de65_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170510/20170510_79d45c5e712937dc2b5c278ef61a5631_cover_mwpm_03200403.jpeg"},{"uniquekey":"8b8a43446c66d641830de23715c0c417","title":"农村小伙上山干活，竟然发现一活宝，他的做法出人意料！","date":"2017-05-10 11:38","category":"头条","author_name":"小晖世界观","url":"http://mini.eastday.com/mobile/170510113851143.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170510/20170510_ddbb6b1c7d1dc68a5757581d7e84a3fe_cover_mwpm_03200403.png","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170510/20170510_dc84d4923b2570ad309d46d11ea786eb_cover_mwpm_03200403.png","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170510/20170510_b210a6c50148d4e4b01350af5e8821db_cover_mwpm_03200403.png"},{"uniquekey":"7e0e1e7fbd74cc5914fb2d6cbd0bcfb7","title":"别再说钟丽缇看过去比张伦硕还壮，近日钟丽缇瘦到变身时尚辣妈！","date":"2017-05-10 11:38","category":"头条","author_name":"小娱乐在线","url":"http://mini.eastday.com/mobile/170510113847007.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170510/20170510_809a0439900ead44e0ac8304c03925ae_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170510/20170510_47b37f3f51c4caa8e94d81df1bd1e7fb_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170510/20170510_0edaaa0847a538cf2feb6c95b7f1be6d_cover_mwpm_03200403.jpeg"},{"uniquekey":"035f033f01ed5236985782c164db7fa5","title":"美计划向阿富汗增兵数千 俄方不看好美能稳定阿局势","date":"2017-05-10 11:30","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170510113046153.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170510/20170510113046_687eb6d2f53fc0178a24a77e042b4510_1_mwpm_03200403.jpeg"},{"uniquekey":"b999f8ec468425157834224ddfce684f","title":"快讯：文在寅宣誓就任韩国第19届总统","date":"2017-05-10 11:26","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170510112625541.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170510/20170510112625_cae374575e10e55faaadf362dc82336d_1_mwpm_03200403.png"},{"uniquekey":"ad76329d321af996eca5a7c852ca147e","title":"蔡英文再作妖！用日文发推特\"感谢日本\"  遭台网友怒怼：典型汉奸","date":"2017-05-10 11:16","category":"头条","author_name":"东方网东方头条","url":"http://mini.eastday.com/mobile/170510111647992.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170510/20170510111647_2cd8e5342815fc66e9f015ce0e308bb0_1_mwpm_03200403.png","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170510/20170510111647_0c355a71251dc999a38ce0856ff3c270_2_mwpm_03200403.png","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170510/20170510111647_48e27225238120dbbfcaacf07f406dce_3_mwpm_03200403.png"},{"uniquekey":"60c48dea3b8c4b138673855fe99191de","title":"韩媒:韩\u201c世越\u201d号沉船首次发现推断为人骨遗骸","date":"2017-05-10 11:16","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170510111621335.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170510/20170510111621_3ac1f5790792b81a722ad8b01beed384_1_mwpm_03200403.jpeg"},{"uniquekey":"aecf72e092068a3189f72b19ee53b4cf","title":"爽妹子微博小号发文再次怒怼评论","date":"2017-05-10 11:12","category":"头条","author_name":"中国网","url":"http://mini.eastday.com/mobile/170510111256670.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170510/20170510111256_66f046dc2dbad99257bb4ae660c3d180_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170510/20170510111256_66f046dc2dbad99257bb4ae660c3d180_2_mwpm_03200403.jpeg"},{"uniquekey":"f7349528525205f5348ee83afa547963","title":"明察｜陕西宝鸡榆林两地辟谣\u201c飞机撒药治白蚁\u201d：不会用飞机","date":"2017-05-10 11:12","category":"头条","author_name":"澎湃新闻","url":"http://mini.eastday.com/mobile/170510111229578.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170510/20170510111229_2535f083815ca9028cf9b2d05820249e_1_mwpm_03200403.jpeg"},{"uniquekey":"dfeaa6bf498a60bbaa1248055de09176","title":"白宫：特朗普将在总统办公室会见俄罗斯外长","date":"2017-05-10 11:05","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170510110545743.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170510/20170510110545_077a75165027c4dff6d7150c66265093_1_mwpm_03200403.png"},{"uniquekey":"0ac2920f22d6735e3fcfa3264fce98bc","title":"美国务院对台湾参与WHA表支持 陆学者：美国表态没用 中国说了算","date":"2017-05-10 10:59","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170510105953669.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170510/20170510105953_9c76d572e664b4dd472b01c82e1888fd_1_mwpm_03200403.jpeg"},{"uniquekey":"8e17513d714908c32e44197aaa422599","title":"他接到妻子\"出轨\"不雅照 后面发生的事情 让人冷汗都出来了","date":"2017-05-10 10:59","category":"头条","author_name":"凤凰网","url":"http://mini.eastday.com/mobile/170510105900644.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170510/20170510105900_ad7a02febe08c3c225a9b86a7fb9afdf_3_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170510/20170510105900_ad7a02febe08c3c225a9b86a7fb9afdf_1_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170510/20170510105900_ad7a02febe08c3c225a9b86a7fb9afdf_2_mwpm_03200403.jpeg"},{"uniquekey":"be24c05d82b58ed0fe3531a49ed8c1b4","title":"鼻子疾厄宫看相：山根\u201c高与低\u201d决定人的富贵","date":"2017-05-10 10:59","category":"头条","author_name":"星座西阿兔","url":"http://mini.eastday.com/mobile/170510105900567.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170510/20170510105900_c1cea582db1488e5c66668f631957fc5_2_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170510/20170510105900_c1cea582db1488e5c66668f631957fc5_3_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170510/20170510105900_c1cea582db1488e5c66668f631957fc5_4_mwpm_03200403.jpeg"}]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * stat : 1
         * data : [{"uniquekey":"baa3bccaaeebaba2bac7c1ee71cd931f","title":"云南监狱逃犯张林苍出逃9天被抓获","date":"2017-05-10 12:54","category":"头条","author_name":"国际在线","url":"http://mini.eastday.com/mobile/170510125400228.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170510/20170510125400_7ee863abf3bd621ef9b42ff7a8c5f9d0_3_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170510/20170510125400_40a8879ccf593e7ccc4b1c525b020775_1_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170510/20170510125400_119b7590a13129309873c7f09c7e8951_2_mwpm_03200403.jpeg"},{"uniquekey":"7b863eeaf7f0c557e4f31d0578b285d2","title":"武汉大熊猫鼻头变白疑场馆环境差所致 园方回应","date":"2017-05-10 13:20","category":"头条","author_name":"封面新闻","url":"http://mini.eastday.com/mobile/170510132021017.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170510/20170510132021_d1c8870caa1e0a8876503776a3c499df_1_mwpm_03200403.png","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170510/20170510132021_d1c8870caa1e0a8876503776a3c499df_2_mwpm_03200403.png"},{"uniquekey":"490c0a3328031d8d7f3b27c979a83c3a","title":"文在寅就职演讲：不在青瓦台办公，将与中美磋商萨德问题","date":"2017-05-10 13:17","category":"头条","author_name":"澎湃新闻","url":"http://mini.eastday.com/mobile/170510131706474.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170510/20170510131706_3906fa56bc131cc57d4eea24735e7fc2_1_mwpm_03200403.jpeg"},{"uniquekey":"ab0ed2d8aab4e6fc2dda52049a13f2dd","title":"破解\u201c人难找\u201d 河南探索打击拒执犯罪新模式","date":"2017-05-10 13:12","category":"头条","author_name":"人民网-河南频道","url":"http://mini.eastday.com/mobile/170510131253394.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170510/20170510131253_6d2400ac5c458124b14d9793b750a6b2_1_mwpm_03200403.jpeg"},{"uniquekey":"eef8b47d9fd17c8672fdf8d4a7cc78a5","title":"把调查竞选团队是否通俄的FBI局长解雇后，特朗普见俄外长","date":"2017-05-10 13:06","category":"头条","author_name":"澎湃新闻","url":"http://mini.eastday.com/mobile/170510130633819.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170510/20170510130633_f134fca0b6985c5795c59084adcaeae1_1_mwpm_03200403.jpeg"},{"uniquekey":"d6a801b3eb0e3800eb50f767417ce413","title":"支付宝因违反支付业务规定 被央行上海分行罚款3万元","date":"2017-05-10 12:59","category":"头条","author_name":"中国网财经","url":"http://mini.eastday.com/mobile/170510125906399.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170510/20170510125906_01f5fc919e3d58d8487beb8699607fc4_1_mwpm_03200403.jpeg"},{"uniquekey":"a9ae4748b2a4a5d1d14b1400fdf274d4","title":"这个地方十女配一夫！沦为了最缺男人的国家","date":"2017-05-10 12:34","category":"头条","author_name":"小叶世界","url":"http://mini.eastday.com/mobile/170510123412672.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170510/20170510_eaeed071e060cfb926e29e9a0e889f20_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170510/20170510_f41f79edc2eeaad15cfd1b01767be8f8_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170510/20170510_0f88aebd3bb29c8577d2fe0823822791_cover_mwpm_03200403.jpeg"},{"uniquekey":"673b1534a55141d5d652d8810b789e7f","title":"文在寅高票当选韩国总统 今天上午将宣誓就任","date":"2017-05-10 12:33","category":"头条","author_name":"央视新闻客户端","url":"http://mini.eastday.com/mobile/170510123346439.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170510/20170510123346_d022cb0e401a425eb6aac78ce28e0a5c_5_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170510/20170510123346_d022cb0e401a425eb6aac78ce28e0a5c_4_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170510/20170510123346_d022cb0e401a425eb6aac78ce28e0a5c_1_mwpm_03200403.jpeg"},{"uniquekey":"aecc8543454335f7607a215cb602c606","title":"剑指\u201c萨德\u201d？国防部爆猛料：火箭军在渤海试射新型导弹","date":"2017-05-10 12:31","category":"头条","author_name":"东方网东方头条","url":"http://mini.eastday.com/mobile/170510123128110.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170510/20170510123128_dfb11183bad5a3ef0c6282557b80e0cf_1_mwpm_03200403.png"},{"uniquekey":"6d532eee09fc8528c34afd5997a964d1","title":"台湾海基会盼下半年能参访大陆 国台办回应","date":"2017-05-10 12:25","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170510122526013.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170510/20170510122526_843407995223ae4e7e0ada2bbce57b65_1_mwpm_03200403.jpeg"},{"uniquekey":"0d979d68d7bd2878f6eff4f6cd7856e1","title":"蔡英文用\u201c中国\u201d指称\u201c中国大陆\u201d 国台办回应","date":"2017-05-10 12:11","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170510121135152.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170510/20170510121135_22b82a7ce5164d47ed4a8e361cde4377_1_mwpm_03200403.jpeg"},{"uniquekey":"d203a88fe25512294c7e47b2755624c8","title":"央视今日发布\u201cCCTV中国品牌榜\u201d入围名单！谁会上榜？","date":"2017-05-10 11:54","category":"头条","author_name":"央视网","url":"http://mini.eastday.com/mobile/170510115437927.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170510/20170510115437_4579d870877c4c38460504cb8b93f98b_1_mwpm_03200403.jpeg"},{"uniquekey":"2a39b80b38451312572b458db349a4cb","title":"禽兽！校长性侵小学女生，致其怀孕！","date":"2017-05-10 11:52","category":"头条","author_name":"手术通","url":"http://mini.eastday.com/mobile/170510115246289.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170510/20170510_e7f8e109339fe80e535f7e734e0fd905_mwpm_03200403.png","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170510/20170510_0ca05d1a17e342483b6bb1784642a316_mwpm_03200403.png","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170510/20170510_4f511218c7cb158858fbd66567b88935_mwpm_03200403.png"},{"uniquekey":"80ac270f93e5a79d051f61f0a2269f31","title":"河南商丘市平台办事处\u201c5-7\u201d惨祸背后的拆迁利益链","date":"2017-05-10 11:49","category":"头条","author_name":"中国发展网","url":"http://mini.eastday.com/mobile/170510114929450.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170510/20170510114929_ad549589c79961748f28f1a06888bc76_3_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170510/20170510114929_ad549589c79961748f28f1a06888bc76_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170510/20170510114929_ad549589c79961748f28f1a06888bc76_1_mwpm_03200403.jpeg"},{"uniquekey":"30620ee52e241a950c7c466d607ffa7e","title":"中美军事差距到底有多大？张召忠意外揭开真相 国内一片哗然 ","date":"2017-05-10 11:45","category":"头条","author_name":"东方号","url":"http://mini.eastday.com/mobile/170510114504742.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170510/20170510114504_ea784147ed0401109d7c528c88095b1b_7_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170510/20170510114504_ea784147ed0401109d7c528c88095b1b_1_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170510/20170510114504_ea784147ed0401109d7c528c88095b1b_6_mwpm_03200403.jpeg"},{"uniquekey":"a39f9941e2cc936ecd45caeb4e28f457","title":"学不来许晴的气质就别穿同款，赵丽颖就是最好的例子，无法掩饰的尴尬","date":"2017-05-10 11:44","category":"头条","author_name":"轮花娱乐","url":"http://mini.eastday.com/mobile/170510114402916.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170510/20170510_fa9b8c793ac65cb98e68569155258f91_cover_mwpm_03200403.png","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170510/20170510_1dfdf3e7832ed03d6e5334f4996cd660_cover_mwpm_03200403.png","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170510/20170510_dbcfbef9ba4e845601af07d8176aeef4_cover_mwpm_03200403.png"},{"uniquekey":"e9a13b1848fe2d73306c9c5d10d6c1ff","title":"在野外遇到这些\u201c怪物\u201d不要恐慌不要踩，躲开就行！","date":"2017-05-10 11:41","category":"头条","author_name":"时尚情感语录","url":"http://mini.eastday.com/mobile/170510114128931.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170510/20170510_10ad1b3ca084ed422fbdf859896b14c4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170510/20170510_75af162d74cca7d17b8243df01f65191_mwpm_03200403.jpg"},{"uniquekey":"06e0c9db8ecd79f9d3e331db7d95ade6","title":"在农村，这样的女人最适合做老婆！","date":"2017-05-10 11:39","category":"头条","author_name":"小晖世界观","url":"http://mini.eastday.com/mobile/170510113907934.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170510/20170510_8ae8708088fa3404d49eb24a13a1fa35_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170510/20170510_9a6d8eb6c178c3091a4442163447de65_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170510/20170510_79d45c5e712937dc2b5c278ef61a5631_cover_mwpm_03200403.jpeg"},{"uniquekey":"8b8a43446c66d641830de23715c0c417","title":"农村小伙上山干活，竟然发现一活宝，他的做法出人意料！","date":"2017-05-10 11:38","category":"头条","author_name":"小晖世界观","url":"http://mini.eastday.com/mobile/170510113851143.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170510/20170510_ddbb6b1c7d1dc68a5757581d7e84a3fe_cover_mwpm_03200403.png","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170510/20170510_dc84d4923b2570ad309d46d11ea786eb_cover_mwpm_03200403.png","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170510/20170510_b210a6c50148d4e4b01350af5e8821db_cover_mwpm_03200403.png"},{"uniquekey":"7e0e1e7fbd74cc5914fb2d6cbd0bcfb7","title":"别再说钟丽缇看过去比张伦硕还壮，近日钟丽缇瘦到变身时尚辣妈！","date":"2017-05-10 11:38","category":"头条","author_name":"小娱乐在线","url":"http://mini.eastday.com/mobile/170510113847007.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170510/20170510_809a0439900ead44e0ac8304c03925ae_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170510/20170510_47b37f3f51c4caa8e94d81df1bd1e7fb_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170510/20170510_0edaaa0847a538cf2feb6c95b7f1be6d_cover_mwpm_03200403.jpeg"},{"uniquekey":"035f033f01ed5236985782c164db7fa5","title":"美计划向阿富汗增兵数千 俄方不看好美能稳定阿局势","date":"2017-05-10 11:30","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170510113046153.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170510/20170510113046_687eb6d2f53fc0178a24a77e042b4510_1_mwpm_03200403.jpeg"},{"uniquekey":"b999f8ec468425157834224ddfce684f","title":"快讯：文在寅宣誓就任韩国第19届总统","date":"2017-05-10 11:26","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170510112625541.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170510/20170510112625_cae374575e10e55faaadf362dc82336d_1_mwpm_03200403.png"},{"uniquekey":"ad76329d321af996eca5a7c852ca147e","title":"蔡英文再作妖！用日文发推特\"感谢日本\"  遭台网友怒怼：典型汉奸","date":"2017-05-10 11:16","category":"头条","author_name":"东方网东方头条","url":"http://mini.eastday.com/mobile/170510111647992.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170510/20170510111647_2cd8e5342815fc66e9f015ce0e308bb0_1_mwpm_03200403.png","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170510/20170510111647_0c355a71251dc999a38ce0856ff3c270_2_mwpm_03200403.png","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170510/20170510111647_48e27225238120dbbfcaacf07f406dce_3_mwpm_03200403.png"},{"uniquekey":"60c48dea3b8c4b138673855fe99191de","title":"韩媒:韩\u201c世越\u201d号沉船首次发现推断为人骨遗骸","date":"2017-05-10 11:16","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170510111621335.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170510/20170510111621_3ac1f5790792b81a722ad8b01beed384_1_mwpm_03200403.jpeg"},{"uniquekey":"aecf72e092068a3189f72b19ee53b4cf","title":"爽妹子微博小号发文再次怒怼评论","date":"2017-05-10 11:12","category":"头条","author_name":"中国网","url":"http://mini.eastday.com/mobile/170510111256670.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170510/20170510111256_66f046dc2dbad99257bb4ae660c3d180_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170510/20170510111256_66f046dc2dbad99257bb4ae660c3d180_2_mwpm_03200403.jpeg"},{"uniquekey":"f7349528525205f5348ee83afa547963","title":"明察｜陕西宝鸡榆林两地辟谣\u201c飞机撒药治白蚁\u201d：不会用飞机","date":"2017-05-10 11:12","category":"头条","author_name":"澎湃新闻","url":"http://mini.eastday.com/mobile/170510111229578.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170510/20170510111229_2535f083815ca9028cf9b2d05820249e_1_mwpm_03200403.jpeg"},{"uniquekey":"dfeaa6bf498a60bbaa1248055de09176","title":"白宫：特朗普将在总统办公室会见俄罗斯外长","date":"2017-05-10 11:05","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170510110545743.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170510/20170510110545_077a75165027c4dff6d7150c66265093_1_mwpm_03200403.png"},{"uniquekey":"0ac2920f22d6735e3fcfa3264fce98bc","title":"美国务院对台湾参与WHA表支持 陆学者：美国表态没用 中国说了算","date":"2017-05-10 10:59","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170510105953669.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170510/20170510105953_9c76d572e664b4dd472b01c82e1888fd_1_mwpm_03200403.jpeg"},{"uniquekey":"8e17513d714908c32e44197aaa422599","title":"他接到妻子\"出轨\"不雅照 后面发生的事情 让人冷汗都出来了","date":"2017-05-10 10:59","category":"头条","author_name":"凤凰网","url":"http://mini.eastday.com/mobile/170510105900644.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170510/20170510105900_ad7a02febe08c3c225a9b86a7fb9afdf_3_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170510/20170510105900_ad7a02febe08c3c225a9b86a7fb9afdf_1_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170510/20170510105900_ad7a02febe08c3c225a9b86a7fb9afdf_2_mwpm_03200403.jpeg"},{"uniquekey":"be24c05d82b58ed0fe3531a49ed8c1b4","title":"鼻子疾厄宫看相：山根\u201c高与低\u201d决定人的富贵","date":"2017-05-10 10:59","category":"头条","author_name":"星座西阿兔","url":"http://mini.eastday.com/mobile/170510105900567.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170510/20170510105900_c1cea582db1488e5c66668f631957fc5_2_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170510/20170510105900_c1cea582db1488e5c66668f631957fc5_3_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170510/20170510105900_c1cea582db1488e5c66668f631957fc5_4_mwpm_03200403.jpeg"}]
         */

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * uniquekey : baa3bccaaeebaba2bac7c1ee71cd931f
             * title : 云南监狱逃犯张林苍出逃9天被抓获
             * date : 2017-05-10 12:54
             * category : 头条
             * author_name : 国际在线
             * url : http://mini.eastday.com/mobile/170510125400228.html
             * thumbnail_pic_s : http://04.imgmini.eastday.com/mobile/20170510/20170510125400_7ee863abf3bd621ef9b42ff7a8c5f9d0_3_mwpm_03200403.jpeg
             * thumbnail_pic_s02 : http://04.imgmini.eastday.com/mobile/20170510/20170510125400_40a8879ccf593e7ccc4b1c525b020775_1_mwpm_03200403.jpeg
             * thumbnail_pic_s03 : http://04.imgmini.eastday.com/mobile/20170510/20170510125400_119b7590a13129309873c7f09c7e8951_2_mwpm_03200403.jpeg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }
        }
    }
}
