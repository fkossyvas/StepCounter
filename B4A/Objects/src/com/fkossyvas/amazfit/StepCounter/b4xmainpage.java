package com.fkossyvas.amazfit.StepCounter;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "com.fkossyvas.amazfit.StepCounter.b4xmainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.fkossyvas.amazfit.StepCounter.b4xmainpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public int _mysteps = 0;
public anywheresoftware.b4a.objects.LabelWrapper _lblsteps = null;
public com.fkossyvas.amazfit.StepCounter.main _main = null;
public com.fkossyvas.amazfit.StepCounter.starter _starter = null;
public com.fkossyvas.amazfit.StepCounter.b4xpages _b4xpages = null;
public com.fkossyvas.amazfit.StepCounter.b4xcollections _b4xcollections = null;
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 21;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 22;BA.debugLine="Root.LoadLayout(\"MainPage\")";
_root.LoadLayout("MainPage",ba);
 //BA.debugLineNum = 23;BA.debugLine="UpdateSteps";
_updatesteps();
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public String  _btnadd_click() throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Private Sub BtnAdd_Click";
 //BA.debugLineNum = 34;BA.debugLine="MySteps=MySteps+1";
_mysteps = (int) (_mysteps+1);
 //BA.debugLineNum = 35;BA.debugLine="UpdateSteps";
_updatesteps();
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public String  _btnreset_click() throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Private Sub BtnReset_Click";
 //BA.debugLineNum = 29;BA.debugLine="MySteps=0";
_mysteps = (int) (0);
 //BA.debugLineNum = 30;BA.debugLine="UpdateSteps";
_updatesteps();
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 11;BA.debugLine="Private MySteps As Int = 0";
_mysteps = (int) (0);
 //BA.debugLineNum = 12;BA.debugLine="Private LblSteps As Label";
_lblsteps = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public String  _updatesteps() throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Private Sub UpdateSteps";
 //BA.debugLineNum = 39;BA.debugLine="LblSteps.Text=MySteps";
_lblsteps.setText(BA.ObjectToCharSequence(_mysteps));
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
