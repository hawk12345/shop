package com.lyq.model.product;

import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;
/**
 * 产品类别
 * @author Li Yongqiang
 */
public class ProductCategoryCopy2 implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;// 类别编号
	private String name;// 类别名称
	private int level = 1;// 层次
	private Set<ProductCategoryCopy2> children;// 子产品类别
	private ProductCategoryCopy2 parent;// 父类别
	private Set<ProductInfo> products = new TreeSet<ProductInfo>();// 包含商品
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<ProductCategoryCopy2> getChildren() {
		return children;
	}
	public void setChildren(Set<ProductCategoryCopy2> children) {
		this.children = children;
	}
	public ProductCategoryCopy2 getParent() {
		return parent;
	}
	public void setParent(ProductCategoryCopy2 parent) {
		this.parent = parent;
	}
	public Set<ProductInfo> getProducts() {
		return products;
	}
	public void setProducts(Set<ProductInfo> products) {
		this.products = products;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
}
