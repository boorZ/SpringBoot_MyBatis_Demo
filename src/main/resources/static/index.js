var zl=new Vue({
    methods: {
        all(url,type) {
            console.log("测试！");
            jQuery.ajax({
                /* 请求地址 */
                url: url+"/findAll",
                /* 请求的类型 */
                type: type,
                /* 请求成功的回调函数 */
                success: function (data) {
                    for (var i = 0; i < data.length; i++) {
                        // console.log(data[i]);
                        vmm.datas.push(data[i]);
                    }
                }
            });
        },
        addClick(url, serialize, type) {
            jQuery.ajax({
                /* 请求地址 */
                url: url+"/addone",
                /* 请求要带的数据 */
                data : serialize,
                /* 请求的类型 */
                type: type,
                /* 请求成功的回调函数 */
                success: function (data) {
                    if(data.code == 100) {
                        alert("添加成功！")
                        zl.all(url,"get");
                        $("#addModal").modal('toggle');
                    }else{
                        alert("添加失败！");
                    }
                }
            });
        },
    }
});