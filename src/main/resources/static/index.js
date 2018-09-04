var zl=new Vue({
    methods: {
        all(url,type) {
            jQuery.ajax({
                /* 请求地址 */
                url: url,
                /* 请求的类型 */
                type: type,
                /* 请求成功的回调函数 */
                success: function (data) {
                    for (var i = 0; i < data.length; i++) {
                        console.log(data[i]);
                        vmm.datas.push(data[i]);
                    }
                }
            });
        },
        addClick(url, serialize, type,) {
            console.log("add:");
            jQuery.ajax({
                /* 请求地址 */
                url: url,
                /* 请求要带的数据 */
                data : serialize,
                /* 请求的类型 */
                type: type,
                /* 请求成功的回调函数 */
                success: function (data) {
                    addModal
                }
            });
        },
    }
});