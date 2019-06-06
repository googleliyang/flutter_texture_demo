package com.example.simple_texture_demo;

import android.os.Bundle;
import io.flutter.app.FlutterActivity;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.GeneratedPluginRegistrant;

public class MainActivity extends FlutterActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
//    OpenglTexturePlugin.registerWith(this);
    final String key = MainActivity.class.getCanonicalName();
    if (this.hasPlugin(key)) return;
    PluginRegistry.Registrar regis =  this.registrarFor(key);
    OpenglTexturePlugin.registerWith(regis);
    GeneratedPluginRegistrant.registerWith(this);
  }
}
