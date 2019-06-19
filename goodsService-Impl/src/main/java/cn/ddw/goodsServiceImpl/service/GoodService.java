package cn.ddw.goodsServiceImpl.service;

import cn.ddw.apiService.goodsService.entity.Commodity;

import java.util.List;

/**
 * @author ZYF
 * @date 2019/6/11 13:47
 * @Description :
 */
public interface GoodService {

//    获取信息商品
    List<Commodity> getAll();

//    根据id获取商品
    Commodity getById(Integer id);

//
}