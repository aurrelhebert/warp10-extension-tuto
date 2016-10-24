package io.warp10.tutorial;

import java.util.List;

import io.warp10.script.NamedWarpScriptFunction;
import io.warp10.script.WarpScriptException;
import io.warp10.script.WarpScriptStack;
import io.warp10.script.WarpScriptStackFunction;
import io.warp10.warp.sdk.WarpScriptJavaFunction;
import io.warp10.warp.sdk.WarpScriptJavaFunctionException;
import io.warp10.warp.sdk.WarpScriptRawJavaFunction;

public class HELLOWARP10 extends NamedWarpScriptFunction implements WarpScriptStackFunction {
  
  public HELLOWARP10(String name) {
    super(name);
  }
  
  public Object apply(WarpScriptStack stack) throws WarpScriptException {
    
    //
    // Get params
    //
    
    Object firstText = stack.pop();
    Object secondText = stack.pop();
    
    if (!(firstText instanceof String)) {
      throw new WarpScriptException("First param must be a String");
      //throw new WarpScriptJavaFunctionException();
    }
    if (!(secondText instanceof String)) {
      throw new WarpScriptException("Second param must be a String");
      //throw new WarpScriptJavaFunctionException();
    }
    try {
      stack.push(firstText.toString() + ' ' + secondText.toString());
    } catch (WarpScriptException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      throw new WarpScriptException("Stack exception" + e.getMessage() + e.getStackTrace().toString());
      //throw new WarpScriptJavaFunctionException();
    }
    
    return stack;  
  }
  
  //
  // Not necessary here
  //
  public int argDepth() {
    return 0;
  }

  //
  // Not necessary here
  //
  public boolean isProtected() {
    // TODO Auto-generated method stub
    return false;
  }

}
