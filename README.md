# Flink Kotlin Helper

Compile-only flink helpers for Kotlin.

## Install

This project is hosted on jitpack.

Add it in your root build.gradle at the end of repositories:

    allprojects {
        repositories {
            ...
            maven { url 'https://jitpack.io' }
        }
    }

then add the dependencies.

    dependencies {
        implementation 'com.github.jason5lee.flink-kt-helper:flink-kt-table-helper:0.1.1'
    }

For other build tools, check [JitPack documentation](https://jitpack.io/#jason5lee/flink-kt-helper/0.1.1).

## Modules

Currently, this project has 3 modules: `flink-kt-table-helper` for table API, `flink-kt-tuple-helper` for tuple construction,
and `flink-kt-streaming-helper` for streaming API.