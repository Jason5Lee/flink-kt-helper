package io.github.jason5lee.flinkKtHelper.streaming

import org.apache.flink.api.java.functions.KeySelector
import org.apache.flink.streaming.api.datastream.DataStream
import org.apache.flink.streaming.api.datastream.KeyedStream

/**
 * Creates a new [KeyedStream] that uses the provided kotlin lambda
 * as the key selector for partitioning its operator states.
 *
 * Note that the SAM constructor cannot be removed, otherwise runtime exception will occur.
 *
 * @param selector
 *            The Kotlin lambda for the KeySelector that will be used for extracting the key for partitioning
 * @return The [DataStream] with partitioned state (i.e. KeyedStream)
 *
 */
@Suppress("RedundantSamConstructor")
inline fun <T, R> DataStream<T>.keyByKt(crossinline selector: (T) -> R): KeyedStream<T, R> =
        keyBy(KeySelector<T, R> { selector(it) })
