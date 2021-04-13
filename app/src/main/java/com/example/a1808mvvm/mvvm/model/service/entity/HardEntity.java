package com.example.a1808mvvm.mvvm.model.service.entity;

import com.example.net.entity.BaseEntity;

import java.util.List;

public class HardEntity {

    /**
     * code : 200
     * data : [{"id":1,"newscode":"ad1b13a5f16045bcbd01fd8cf992b41e","userid":1,"content":"123123","imgs":"sample string 1|sample string 2","ctime":"2020/1/19 13:27:53"},{"id":1,"newscode":"ad1b13a5f16045bcbd01fd8cf992b41e","userid":1,"content":"123123","imgs":"sample string 1|sample string 2","ctime":"2020/1/19 13:27:53"},{"id":8,"newscode":"eaa2f22812e646a19b44288e28ed1ca5","userid":1,"content":"123123","imgs":"sample string 1|sample string 2","ctime":"2020/1/27 15:21:35"},{"id":8,"newscode":"eaa2f22812e646a19b44288e28ed1ca5","userid":1,"content":"123123","imgs":"sample string 1|sample string 2","ctime":"2020/1/27 15:21:35"},{"id":9,"newscode":"edc50a2751264939b3051e2ff7b1f776","userid":1,"content":"456456","imgs":"sample string 1|sample string 2","ctime":"2020/1/27 15:24:07"},{"id":9,"newscode":"edc50a2751264939b3051e2ff7b1f776","userid":1,"content":"456456","imgs":"sample string 1|sample string 2","ctime":"2020/1/27 15:24:07"},{"id":74,"newscode":"3b76c021042f4043bec1f55801a92828","userid":1,"content":"111111","imgs":"sample string 1|sample string 2","ctime":"2020/2/3 16:37:41"},{"id":74,"newscode":"3b76c021042f4043bec1f55801a92828","userid":1,"content":"111111","imgs":"sample string 1|sample string 2","ctime":"2020/2/3 16:37:41"},{"id":87,"newscode":"0b4fef07c13c463aa7cad91a328edcb2","userid":1,"content":"1232312333","imgs":"sample string 1|sample string 2","ctime":"2020/11/26 19:33:10"},{"id":87,"newscode":"0b4fef07c13c463aa7cad91a328edcb2","userid":1,"content":"1232312333","imgs":"sample string 1|sample string 2","ctime":"2020/11/26 19:33:10"},{"id":102,"newscode":"3c94b625998a42c0ae4b6b575515624d","userid":1,"content":"1","imgs":"","ctime":"2020/11/26 20:13:43"},{"id":102,"newscode":"3c94b625998a42c0ae4b6b575515624d","userid":1,"content":"1","imgs":"","ctime":"2020/11/26 20:13:43"},{"id":105,"newscode":"511781d066f14fd690a90e42789d3c68","userid":1,"content":"21212","imgs":"sample string 1|sample string 2","ctime":"2020/11/27 9:49:49"},{"id":105,"newscode":"511781d066f14fd690a90e42789d3c68","userid":1,"content":"21212","imgs":"sample string 1|sample string 2","ctime":"2020/11/27 9:49:49"},{"id":111,"newscode":"33b802ebdd08417ca7b9243f988aaf08","userid":1,"content":"哈哈","imgs":"sample string 1|sample string 2","ctime":"2020/11/27 13:36:07"},{"id":111,"newscode":"33b802ebdd08417ca7b9243f988aaf08","userid":1,"content":"哈哈","imgs":"sample string 1|sample string 2","ctime":"2020/11/27 13:36:07"},{"id":119,"newscode":"c105c968d29e42f6b98b944cf61c91ca","userid":1,"content":"我王涛是sb,我骄傲了吗","imgs":"sample string 1|sample string 2","ctime":"2020/11/27 13:49:01"},{"id":119,"newscode":"c105c968d29e42f6b98b944cf61c91ca","userid":1,"content":"我王涛是sb,我骄傲了吗","imgs":"sample string 1|sample string 2","ctime":"2020/11/27 13:49:01"},{"id":120,"newscode":"75ecfc6cdadb48b0a0d8ec83d84ed919","userid":1,"content":"哈哈","imgs":"sample string 1|sample string 2","ctime":"2020/11/27 13:51:53"},{"id":120,"newscode":"75ecfc6cdadb48b0a0d8ec83d84ed919","userid":1,"content":"哈哈","imgs":"sample string 1|sample string 2","ctime":"2020/11/27 13:51:53"},{"id":121,"newscode":"7593de3cd027458e9d5a8f8cfb43782f","userid":1,"content":"哈哈","imgs":"","ctime":"2020/11/27 13:57:25"},{"id":121,"newscode":"7593de3cd027458e9d5a8f8cfb43782f","userid":1,"content":"哈哈","imgs":"","ctime":"2020/11/27 13:57:25"},{"id":122,"newscode":"7f2be34e16704db99fdd36f1822d481c","userid":1,"content":"哈哈","imgs":"","ctime":"2020/11/27 13:57:25"},{"id":122,"newscode":"7f2be34e16704db99fdd36f1822d481c","userid":1,"content":"哈哈","imgs":"","ctime":"2020/11/27 13:57:25"},{"id":123,"newscode":"249cbf04b4e64e33910dc9029bf2b6c7","userid":1,"content":"李嘉辉白白的","imgs":"sample string 1|sample string 2","ctime":"2020/11/27 14:03:26"},{"id":123,"newscode":"249cbf04b4e64e33910dc9029bf2b6c7","userid":1,"content":"李嘉辉白白的","imgs":"sample string 1|sample string 2","ctime":"2020/11/27 14:03:26"},{"id":125,"newscode":"bc3f38113c364f31b593d5b63bdad896","userid":1,"content":"我天才王涛谁也不服","imgs":"","ctime":"2020/11/27 14:07:34"},{"id":125,"newscode":"bc3f38113c364f31b593d5b63bdad896","userid":1,"content":"我天才王涛谁也不服","imgs":"","ctime":"2020/11/27 14:07:34"},{"id":126,"newscode":"078b6490f4224c6090b65bf58976564b","userid":1,"content":"我天才王涛谁也不服","imgs":"","ctime":"2020/11/27 14:07:37"},{"id":126,"newscode":"078b6490f4224c6090b65bf58976564b","userid":1,"content":"我天才王涛谁也不服","imgs":"","ctime":"2020/11/27 14:07:37"},{"id":127,"newscode":"cbaae65ae68a490c81426602d99c734d","userid":1,"content":"天才王涛劝你耗子尾汁","imgs":"","ctime":"2020/11/27 14:08:15"},{"id":127,"newscode":"cbaae65ae68a490c81426602d99c734d","userid":1,"content":"天才王涛劝你耗子尾汁","imgs":"","ctime":"2020/11/27 14:08:15"},{"id":128,"newscode":"8cfb7b6f12334ce0bc66b4e839a74bc3","userid":1,"content":"张文瑀是天才王涛的儿子","imgs":"|一大把的人民币","ctime":"2020/11/27 14:17:27"},{"id":128,"newscode":"8cfb7b6f12334ce0bc66b4e839a74bc3","userid":1,"content":"张文瑀是天才王涛的儿子","imgs":"|一大把的人民币","ctime":"2020/11/27 14:17:27"},{"id":129,"newscode":"12949f32295145b1873ecc2b0e5c25ff","userid":1,"content":"很快啊","imgs":"1|很快啊","ctime":"2020/11/27 14:18:41"},{"id":129,"newscode":"12949f32295145b1873ecc2b0e5c25ff","userid":1,"content":"很快啊","imgs":"1|很快啊","ctime":"2020/11/27 14:18:41"},{"id":130,"newscode":"e102caa938904a239d3378d34e76a757","userid":1,"content":"一个闪电五连鞭","imgs":"sample string 1|sample string 2","ctime":"2020/11/27 14:23:58"},{"id":130,"newscode":"e102caa938904a239d3378d34e76a757","userid":1,"content":"一个闪电五连鞭","imgs":"sample string 1|sample string 2","ctime":"2020/11/27 14:23:58"},{"id":135,"newscode":"bc24b7968e81409088711d91e4f52227","userid":1,"content":"你是个睿智","imgs":"","ctime":"2020/11/27 14:46:39"},{"id":135,"newscode":"bc24b7968e81409088711d91e4f52227","userid":1,"content":"你是个睿智","imgs":"","ctime":"2020/11/27 14:46:39"},{"id":141,"newscode":"ad047432526642f99f2e2ee3a54ffbaa","userid":1,"content":"","imgs":"","ctime":"2020/11/27 16:16:38"},{"id":141,"newscode":"ad047432526642f99f2e2ee3a54ffbaa","userid":1,"content":"","imgs":"","ctime":"2020/11/27 16:16:38"},{"id":145,"newscode":"5a2d6c09330a4984a2952dc81f70c6c0","userid":1,"content":"水土不服李嘉辉","imgs":"sample string 1|sample string 2","ctime":"2020/11/27 18:22:43"},{"id":145,"newscode":"5a2d6c09330a4984a2952dc81f70c6c0","userid":1,"content":"水土不服李嘉辉","imgs":"sample string 1|sample string 2","ctime":"2020/11/27 18:22:43"},{"id":155,"newscode":"6113cb311ecd4f609d1dc0abd04bda1d","userid":774,"content":"你好","imgs":"https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=3182678716,265847244&fm=26&gp=0.jpg|http://vfx.mtime.cn/Video/2019/03/18/mp4/190318214226685784.mp4","ctime":"2020/11/27 18:46:36"},{"id":158,"newscode":"1b11c847d32a4ffea8b2462d680b7b65","userid":1,"content":"","imgs":"","ctime":"2020/11/27 18:54:31"},{"id":158,"newscode":"1b11c847d32a4ffea8b2462d680b7b65","userid":1,"content":"","imgs":"","ctime":"2020/11/27 18:54:31"},{"id":159,"newscode":"07a5907c74b94d958d97d8449dd1d796","userid":1,"content":"","imgs":"","ctime":"2020/11/27 18:56:37"},{"id":159,"newscode":"07a5907c74b94d958d97d8449dd1d796","userid":1,"content":"","imgs":"","ctime":"2020/11/27 18:56:37"},{"id":171,"newscode":"4154728872df483cacc3995bf33fb015","userid":774,"content":"做你没做过的事情叫成长,做你不愿意做的事情叫改变,做你不敢做的事情叫突破 。","imgs":"https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=3182678716,265847244&fm=26&gp=0.jpg|https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=3212352211,268174215&fm=11&gp=0.jpg","ctime":"2020/11/27 19:08:27"},{"id":184,"newscode":"bf2c2385040343b89490594c160fdc17","userid":774,"content":"无论你现在感觉如何,请起床、穿好衣服然后为你的梦想而奋斗。","imgs":"sample string 1|sample string 2","ctime":"2020/11/27 19:38:14"},{"id":187,"newscode":"9da485ed5d9440caaa02cdbb49a49998","userid":1,"content":"giao","imgs":"","ctime":"2020/11/27 19:54:14"},{"id":187,"newscode":"9da485ed5d9440caaa02cdbb49a49998","userid":1,"content":"giao","imgs":"","ctime":"2020/11/27 19:54:14"},{"id":188,"newscode":"3ded928f3bd84233bd397f78da691ca5","userid":1,"content":"我草","imgs":"","ctime":"2020/11/27 19:55:16"},{"id":188,"newscode":"3ded928f3bd84233bd397f78da691ca5","userid":1,"content":"我草","imgs":"","ctime":"2020/11/27 19:55:16"},{"id":192,"newscode":"e9622d4280a04186bc449fdf4a55c32e","userid":1,"content":"        天才王涛谁也不服❤❤","imgs":"","ctime":"2020/11/27 20:12:49"},{"id":192,"newscode":"e9622d4280a04186bc449fdf4a55c32e","userid":1,"content":"        天才王涛谁也不服❤❤","imgs":"","ctime":"2020/11/27 20:12:49"},{"id":198,"newscode":"2dedc8caff8d4c0e826d4f3cd01e9cb2","userid":1,"content":"一给我哩giaogiao","imgs":"","ctime":"2020/11/27 20:16:52"},{"id":198,"newscode":"2dedc8caff8d4c0e826d4f3cd01e9cb2","userid":1,"content":"一给我哩giaogiao","imgs":"","ctime":"2020/11/27 20:16:52"},{"id":199,"newscode":"87465dabf67246d993b2a9734426c769","userid":1,"content":"fa wai kuang tu wang xiao long","imgs":"","ctime":"2020/11/27 20:17:15"},{"id":199,"newscode":"87465dabf67246d993b2a9734426c769","userid":1,"content":"fa wai kuang tu wang xiao long","imgs":"","ctime":"2020/11/27 20:17:15"},{"id":201,"newscode":"abd7362d38f24d0f84acd6623d38bb3d","userid":1,"content":"Life is a fucking movie","imgs":"","ctime":"2020/11/27 20:20:52"},{"id":201,"newscode":"abd7362d38f24d0f84acd6623d38bb3d","userid":1,"content":"Life is a fucking movie","imgs":"","ctime":"2020/11/27 20:20:52"},{"id":202,"newscode":"efcbecc8073d4092ab1305f43c7ee927","userid":1,"content":"阿萨德","imgs":"sample string 1|sample string 2","ctime":"2020/11/27 20:22:11"},{"id":202,"newscode":"efcbecc8073d4092ab1305f43c7ee927","userid":1,"content":"阿萨德","imgs":"sample string 1|sample string 2","ctime":"2020/11/27 20:22:11"},{"id":205,"newscode":"2b44744465aa4f7596ac5274114a679b","userid":1,"content":"    王涛是众生之子❤","imgs":"","ctime":"2020/11/27 20:27:13"},{"id":205,"newscode":"2b44744465aa4f7596ac5274114a679b","userid":1,"content":"    王涛是众生之子❤","imgs":"","ctime":"2020/11/27 20:27:13"},{"id":207,"newscode":"d063cf618e954ca0b2e7aad1c27ae9bd","userid":1,"content":"    人生如戏❤❤❤","imgs":"","ctime":"2020/11/27 20:29:39"},{"id":207,"newscode":"d063cf618e954ca0b2e7aad1c27ae9bd","userid":1,"content":"    人生如戏❤❤❤","imgs":"","ctime":"2020/11/27 20:29:39"},{"id":208,"newscode":"1d5cf8662cb34a1189e39b6b1cad3466","userid":1,"content":"12312321412","imgs":"","ctime":"2020/11/27 20:30:50"},{"id":208,"newscode":"1d5cf8662cb34a1189e39b6b1cad3466","userid":1,"content":"12312321412","imgs":"","ctime":"2020/11/27 20:30:50"},{"id":210,"newscode":"0d13a33e864441dca746f688a798d066","userid":1,"content":"爱情恰恰","imgs":"","ctime":"2020/11/27 20:33:38"},{"id":210,"newscode":"0d13a33e864441dca746f688a798d066","userid":1,"content":"爱情恰恰","imgs":"","ctime":"2020/11/27 20:33:38"},{"id":212,"newscode":"3bc022a6bfdb434285a8f9e518c06596","userid":1,"content":"爱神的黑白羽翼","imgs":"","ctime":"2020/11/27 20:36:23"},{"id":212,"newscode":"3bc022a6bfdb434285a8f9e518c06596","userid":1,"content":"爱神的黑白羽翼","imgs":"","ctime":"2020/11/27 20:36:23"},{"id":215,"newscode":"2d639e8e6335456ea1bfcabaf24ac317","userid":774,"content":"各多少个是大概多少","imgs":"","ctime":"2020/11/27 20:51:36"},{"id":216,"newscode":"93d4e11f2ade4aac8708457981aaa902","userid":774,"content":"哈哈喽","imgs":"","ctime":"2020/11/27 20:56:56"},{"id":218,"newscode":"c026cf39f23348c3a6044a9dc9df2f7a","userid":774,"content":"感受到广东省噶十大歌手大概多少","imgs":"","ctime":"2020/11/28 8:09:11"},{"id":219,"newscode":"3ae6e297850e472985fa3b844cc51b14","userid":774,"content":"你们好","imgs":"","ctime":"2020/11/28 8:16:45"},{"id":220,"newscode":"e4fbfcb1dc334114a545b1c4e2527fe7","userid":1,"content":"我可没时间狐闹。","imgs":"","ctime":"2020/11/28 8:20:09"},{"id":220,"newscode":"e4fbfcb1dc334114a545b1c4e2527fe7","userid":1,"content":"我可没时间狐闹。","imgs":"","ctime":"2020/11/28 8:20:09"},{"id":228,"newscode":"1eee7ffd0f914e95b4ecfcb26c3ac197","userid":774,"content":"哈喽你们好啊  到家京东赛欧","imgs":"","ctime":"2020/11/28 9:24:40"},{"id":233,"newscode":"77e2d7afb76c47fe8964bbe7fd34a6cc","userid":1,"content":"❤","imgs":"","ctime":"2020/11/28 10:13:40"},{"id":233,"newscode":"77e2d7afb76c47fe8964bbe7fd34a6cc","userid":1,"content":"❤","imgs":"","ctime":"2020/11/28 10:13:40"},{"id":236,"newscode":"3eae2bf653f341d69438305849737f72","userid":1,"content":"sdasd","imgs":"","ctime":"2020/11/29 20:13:49"},{"id":236,"newscode":"3eae2bf653f341d69438305849737f72","userid":1,"content":"sdasd","imgs":"","ctime":"2020/11/29 20:13:49"},{"id":237,"newscode":"fad2655665a44a35aa25dab023e03d48","userid":1,"content":"123","imgs":"","ctime":"2020/11/29 20:18:57"},{"id":237,"newscode":"fad2655665a44a35aa25dab023e03d48","userid":1,"content":"123","imgs":"","ctime":"2020/11/29 20:18:57"},{"id":244,"newscode":"8a2d1ec06ed743629dbf394e0aaeccde","userid":774,"content":"以复古与","imgs":"","ctime":"2020/11/30 15:30:35"}]
     * msg : 操作成功
     */
        /**
         * id : 1
         * newscode : ad1b13a5f16045bcbd01fd8cf992b41e
         * userid : 1
         * content : 123123
         * imgs : sample string 1|sample string 2
         * ctime : 2020/1/19 13:27:53
         */

        private int id;
        private String newscode;
        private int userid;
        private String content;
        private String imgs;
        private String ctime;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNewscode() {
            return newscode;
        }

        public void setNewscode(String newscode) {
            this.newscode = newscode;
        }

        public int getUserid() {
            return userid;
        }

        public void setUserid(int userid) {
            this.userid = userid;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getImgs() {
            return imgs;
        }

        public void setImgs(String imgs) {
            this.imgs = imgs;
        }

        public String getCtime() {
            return ctime;
        }

        public void setCtime(String ctime) {
            this.ctime = ctime;
        }
}
