
package com.ghgj.lensson2.fanshe;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//                �汾��
//@SuppressWarnings("serial")
//               ���е�
@SuppressWarnings("all")
class DemoNew implements Serializable{
	
}
class Base{
	public void af() {}
	//�ѹ�ʱ
	@Deprecated
	public void f() {}
	//  ���ͼ��
	@SuppressWarnings("unchecked")
	public void sf() {
		//��ѹ����
		//                 ���������� û��ʹ��
		@SuppressWarnings("unused")
		int n ;
		//                      ԭ������
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
