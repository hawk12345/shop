package com.lyq.action;

import java.util.List;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lyq.model.product.ProductCategory;
import com.lyq.model.product.ProductCategoryCopy;
import com.lyq.model.product.ProductCategoryCopy2;
import com.lyq.model.product.ProductCategoryCopy3;
import com.lyq.model.product.ProductInfo;
@Scope("prototype")
@Controller("indexAction")
public class IndexAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	@Override
	public String execute() throws Exception {
		// 查询所有类别
		String where = "where parent is null";
		categoriesCopy = categoryCopyDao.find(-1, -1, where, null).getList();
		categories = categoryDao.find(-1, -1, where, null).getList();
		categoriesCopy2 = categoryCopy2Dao.find(-1, -1, where, null).getList();
		categoriesCopy3 = categoryCopy3Dao.find(-1, -1, where, null).getList();

		// 查询推荐的商品
		product_commend = productDao.findCommend();
		// 查询销量最高的商品
		product_sellCount = productDao.findSellCount();
		// 查询人气高的商品
		product_clickcount = productDao.findClickcount();
		return SUCCESS;
	}
	
	// 所有类别

	private List<ProductCategory> categories;
	
	private List<ProductCategoryCopy> categoriesCopy;
	
	private List<ProductCategoryCopy2> categoriesCopy2;
	
	private List<ProductCategoryCopy3> categoriesCopy3;
	
	public List<ProductCategoryCopy3> getCategoriesCopy3() {
		return categoriesCopy3;
	}
	public void setCategoriesCopy3(List<ProductCategoryCopy3> categoriesCopy3) {
		this.categoriesCopy3 = categoriesCopy3;
	}
	public List<ProductCategoryCopy2> getCategoriesCopy2() {
		return categoriesCopy2;
	}
	public void setCategoriesCopy2(List<ProductCategoryCopy2> categoriesCopy2) {
		this.categoriesCopy2 = categoriesCopy2;
	}
	public List<ProductCategoryCopy> getCategoriesCopy() {
		return categoriesCopy;
	}
	public void setCategoriesCopy(List<ProductCategoryCopy> categoriesCopy) {
		this.categoriesCopy = categoriesCopy;
	}

	// 推荐商品
	private List<ProductInfo> product_commend;
	// 销售最好的商品
	private List<ProductInfo> product_sellCount;
	// 人气最高的商品
	private List<ProductInfo> product_clickcount;
	public List<ProductCategory> getCategories() {
		return categories;
	}
	public void setCategories(List<ProductCategory> categories) {
		this.categories = categories;
	}
	public List<ProductInfo> getProduct_commend() {
		return product_commend;
	}
	public void setProduct_commend(List<ProductInfo> productCommend) {
		product_commend = productCommend;
	}
	public List<ProductInfo> getProduct_sellCount() {
		return product_sellCount;
	}
	public void setProduct_sellCount(List<ProductInfo> productSellCount) {
		product_sellCount = productSellCount;
	}
	public List<ProductInfo> getProduct_clickcount() {
		return product_clickcount;
	}
	public void setProduct_clickcount(List<ProductInfo> productClickcount) {
		product_clickcount = productClickcount;
	}
}
