package com.mybatis.v1.dao;

import com.mybatis.v1.anno.TulingSelect;
import com.mybatis.v1.entity.ProductInfo;
import org.springframework.stereotype.Component;

/**
 * [来个全套]
 *
 * @slogan: 高于生活，源于生活
 * @Description: TODO
 * @author: smlz
 * @date 2020/5/5 14:03
 */
@Component
public interface ProductMapper {

	@TulingSelect(value = "select * from product_info where product_id=?")
	ProductInfo qryById(Integer productId);
}
