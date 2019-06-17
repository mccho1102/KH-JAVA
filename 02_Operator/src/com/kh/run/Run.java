package com.kh.run;

import com.kh.operator.A_LogicalNegation;
import com.kh.operator.B_InDecrease;
import com.kh.operator.C_Arithmetic;
import com.kh.operator.D_Comparison;
import com.kh.operator.E_Logical;
import com.kh.operator.F_Compound;
import com.kh.operator.G_Triple;

public class Run {
	public static void main(String[] args) {
		A_LogicalNegation ln = new A_LogicalNegation();
		//ln.method1();
		B_InDecrease id = new B_InDecrease();
		//id.method1();
		//id.method4();
		C_Arithmetic ca = new C_Arithmetic();
		//ca.method3();
		D_Comparison dc = new D_Comparison();
		//dc.method2();
		E_Logical el = new E_Logical();
		//el.method4();
		F_Compound fc = new F_Compound();
		//fc.method1();
		G_Triple gt =new G_Triple();
		gt.method3();
		
	}
}
