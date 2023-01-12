package org.shuijing.gushe_app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 摄影师新建一个服务，需要审批，通过后才能上架，上架就是把这些需要审批的信息打上pass，然后判断将pass的信息显示到前端app 前端控制器
 * </p>
 *
 * @author shuijing
 * @since 2023-01-13
 */
@RestController
@RequestMapping("/fAddservice")
public class FAddserviceController {

}
