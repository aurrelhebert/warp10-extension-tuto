package io.warp10.tutorial;

import java.util.HashMap;
import java.util.Map;
import io.warp10.tutorial.HELLOWARP10;

import io.warp10.warp.sdk.WarpScriptExtension;

public class TutorialExtension extends WarpScriptExtension {

  public Map<String, Object> getFunctions() {
    Map<String, Object> functions = new HashMap<String, Object>();
    functions.put("HELLOWARP10", new HELLOWARP10("HELLOWARP10"));
    return functions;
  }

}
