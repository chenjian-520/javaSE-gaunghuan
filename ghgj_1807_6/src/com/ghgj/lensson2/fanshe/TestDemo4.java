
package com.ghgj.lensson2.fanshe;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//                版本号
//@SuppressWarnings("serial")
//               所有的
@SuppressWarnings("all")
class DemoNew implements Serializable{
	
}
class Base{
	public void af() {}
	//已过时
	@Deprecated
	public void f() {}
	//  类型检查
	@SuppressWarnings("unchecked")
	public void sf() {
		//镇压警告
		//                 变量声明了 没有使用
		@SuppressWarnings("unused")
		int n ;
		//                      原生类型
		@SuppressWarnings({ "rawtypes", "unused" })
		List list = new ArrayList();
		list.add("abc");
		list.add(111);
	}
}
class Sub extends Base{
	@Override
	public void af() {}
}

@FunctionalInterface
interface Info{
	void af();
}
public class TestDemo4 {

	public static void main(String[] args) {
		Base base = new Base();
		base.f();
		
	}

}
