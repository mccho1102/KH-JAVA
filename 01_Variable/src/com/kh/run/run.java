package com.kh.run;

import com.kh.variable.A_Variable;
import com.kh.variable.B_KeyboardInput;
import com.kh.variable.C_Constant;
import com.kh.variable.D_Cast;
import com.kh.variable.E_Overflow;
import com.kh.variable.F_Printf;

public class run {
	public static void main(String[] args) {
		A_Variable va = new A_Variable();
		
		//va.noVariable();
		
		//va.usingVariable();
		
		//va.declareVariable();
		
		//va.initVariable();
		
		B_KeyboardInput ki = new B_KeyboardInput();
		// ki.inputScanner1();
		//ki.inputScanner3();
		//ki.changeValue();
		
		C_Constant ct = new C_Constant();
		//ct.testConstant();
		
		D_Cast cast = new D_Cast();
		//cast.rule1();
		//cast.rule2();
		//cast.datalose();
		
		E_Overflow eo = new E_Overflow();
		//eo.overflow();
		//eo.calc();
		
		F_Printf fp = new F_Printf();
		fp.printfMethod();
		
	}

}
