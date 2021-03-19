# AndStrObfuscator
A simple Android string obfuscator.

#### Instructions

1.  Import plugin
```gradle
buildscript {
    repositories {
        maven { url 'https://jitpack.io' }
    }
    dependencies {
        classpath 'com.gitee.yoyochoo:str-obfuscate-plugin:1.0'
    }
}
```
2.  Add plugin dependency in your app
```gradle
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.gitee.yoyochoo:obfuscator:1.0'
}
```
3.  Config plugin
```gradle
apply plugin: 'zhuyouyong.obfuscator'

obfuscate {
    //enable or not, default is true
    enabled = true
    //specify the package to be obfuscated
    packages = [
            'com.xx',
            'com.yy',
            ...
    ]
}
```
