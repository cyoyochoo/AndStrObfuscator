# AndStrObfuscator
A simple Android string obfuscator.

# Instructions
> 1.  Import plugin
```gradle
buildscript {
    repositories {
        maven { url 'https://jitpack.io' }
    }
    dependencies {
        classpath 'com.gitee.yoyochoo:str-obfuscate-plugin:2.0'
    }
}
```
> 2.  Config plugin in your app
```gradle
apply plugin: 'zhuyouyong.obfuscator'

obfuscate {
    //enable or not, default is true
    enabled = true
    //specify the package to be obfuscated, default is none
    packages = [
            'com.xx',
            'com.yy',
            ...
    ]
}
```

# Result
> **Before**
```kotlin
class HomeAct : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        findViewById<TextView>(R.id.txt).text = "Hello"
    }
}
```
> **After**
```java
public final class HomeAct extends AppCompatActivity {
    public HomeAct() {
        super(C0658R.layout.activity_main);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View findViewById = findViewById(C0658R.C0661id.txt);
        ((TextView) findViewById).setText(OooOO0OO.OooOOoo0oo(new byte[]{124, 85, 92, 90, 94}, "400611"));
    }
}
```
