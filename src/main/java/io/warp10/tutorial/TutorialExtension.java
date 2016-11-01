package io.warp10.tutorial;

import java.util.HashMap;
import java.util.Map;
import io.warp10.tutorial.HELLOWARP10;

import io.warp10.warp.sdk.WarpScriptExtension;

public class TutorialExtension extends WarpScriptExtension {

  private final Map<String, Object> functions;
  
  public TutorialExtension() {
    this.functions = new HashMap<String, Object>();
    this.functions.put("HELLOWARP10", new HELLOWARP10("HELLOWARP10"));
  }
  
  public Map<String, Object> getFunctions() {    
    return this.functions;
  }
}
