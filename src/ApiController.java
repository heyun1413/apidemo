import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ApiController {

    /**
     * 获取顶部的类型数据.
     * @return
     */
    @GetMapping("types")
    public Response<List<TypeDTO>> getTypes() {
        List<TypeDTO> types = Arrays.asList(new TypeDTO("0", "首页"),
                new TypeDTO("1", "男装"),
                new TypeDTO("2", "鞋包"));
        return Response.success("获取数据成功", types);
    }

    /**
     * 获取轮播图
     * @return
     */
    @GetMapping("banner-items")
    public Response<List<Item>> getBannerItems() {
        List<Item> items = Arrays.asList(new Item("0", "http://c.hiphotos.baidu.com/image/h%3D300/sign=5975ff04f41986185e47e9847aec2e69/7acb0a46f21fbe09810db97167600c338744ad00.jpg"),
                new Item("1", "http://h.hiphotos.baidu.com/image/h%3D300/sign=6ee370b8861363270aedc433a18fa056/11385343fbf2b211ec2f692ac68065380cd78e55.jpg"),
                new Item("2", "http://a.hiphotos.baidu.com/image/h%3D300/sign=ca7649497e8b4710d12ffbccf3cfc3b2/b64543a98226cffc6ec00edab5014a90f703eaf4.jpg"));
        return Response.success("获取数据成功", items);
    }

    /**
     * 获取限时抢购，品牌清仓，等等选项 ，和上面同样
     * @return
     */
    @GetMapping("option-items")
    public Response<List<Item>> getItems() {
        List<Item> items = Arrays.asList(new Item("0", "http://c.hiphotos.baidu.com/image/h%3D300/sign=5975ff04f41986185e47e9847aec2e69/7acb0a46f21fbe09810db97167600c338744ad00.jpg"),
                new Item("1", "http://h.hiphotos.baidu.com/image/h%3D300/sign=6ee370b8861363270aedc433a18fa056/11385343fbf2b211ec2f692ac68065380cd78e55.jpg"),
                new Item("2", "http://a.hiphotos.baidu.com/image/h%3D300/sign=ca7649497e8b4710d12ffbccf3cfc3b2/b64543a98226cffc6ec00edab5014a90f703eaf4.jpg"));
        return Response.success("获取数据成功", items);
    }



}
