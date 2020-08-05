@file:Suppress("NOTHING_TO_INLINE")

package org.jason5lee.flinkKtHelper.tuple

import org.apache.flink.api.java.tuple.*

inline fun tuple(): Tuple0 = Tuple0.INSTANCE
inline fun <T0> tuple(value0: T0): Tuple1<T0> = Tuple1(value0)
inline fun <T0, T1> tuple(value0: T0, value1: T1): Tuple2<T0, T1> = Tuple2(value0, value1)
inline fun <T0, T1, T2> tuple(value0: T0, value1: T1, value2: T2): Tuple3<T0, T1, T2> = Tuple3(value0, value1, value2)
inline fun <T0, T1, T2, T3> tuple(value0: T0, value1: T1, value2: T2, value3: T3): Tuple4<T0, T1, T2, T3> = Tuple4(value0, value1, value2, value3)
inline fun <T0, T1, T2, T3, T4> tuple(value0: T0, value1: T1, value2: T2, value3: T3, value4: T4): Tuple5<T0, T1, T2, T3, T4> = Tuple5(value0, value1, value2, value3, value4)
inline fun <T0, T1, T2, T3, T4, T5> tuple(value0: T0, value1: T1, value2: T2, value3: T3, value4: T4, value5: T5): Tuple6<T0, T1, T2, T3, T4, T5> = Tuple6(value0, value1, value2, value3, value4, value5)
inline fun <T0, T1, T2, T3, T4, T5, T6> tuple(value0: T0, value1: T1, value2: T2, value3: T3, value4: T4, value5: T5, value6: T6): Tuple7<T0, T1, T2, T3, T4, T5, T6> = Tuple7(value0, value1, value2, value3, value4, value5, value6)
inline fun <T0, T1, T2, T3, T4, T5, T6, T7> tuple(value0: T0, value1: T1, value2: T2, value3: T3, value4: T4, value5: T5, value6: T6, value7: T7): Tuple8<T0, T1, T2, T3, T4, T5, T6, T7> = Tuple8(value0, value1, value2, value3, value4, value5, value6, value7)
inline fun <T0, T1, T2, T3, T4, T5, T6, T7, T8> tuple(value0: T0, value1: T1, value2: T2, value3: T3, value4: T4, value5: T5, value6: T6, value7: T7, value8: T8): Tuple9<T0, T1, T2, T3, T4, T5, T6, T7, T8> = Tuple9(value0, value1, value2, value3, value4, value5, value6, value7, value8)
inline fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9> tuple(value0: T0, value1: T1, value2: T2, value3: T3, value4: T4, value5: T5, value6: T6, value7: T7, value8: T8, value9: T9): Tuple10<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9> = Tuple10(value0, value1, value2, value3, value4, value5, value6, value7, value8, value9)
inline fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> tuple(value0: T0, value1: T1, value2: T2, value3: T3, value4: T4, value5: T5, value6: T6, value7: T7, value8: T8, value9: T9, value10: T10): Tuple11<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> = Tuple11(value0, value1, value2, value3, value4, value5, value6, value7, value8, value9, value10)
inline fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> tuple(value0: T0, value1: T1, value2: T2, value3: T3, value4: T4, value5: T5, value6: T6, value7: T7, value8: T8, value9: T9, value10: T10, value11: T11): Tuple12<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> = Tuple12(value0, value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11)
inline fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> tuple(value0: T0, value1: T1, value2: T2, value3: T3, value4: T4, value5: T5, value6: T6, value7: T7, value8: T8, value9: T9, value10: T10, value11: T11, value12: T12): Tuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> = Tuple13(value0, value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12)
inline fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> tuple(value0: T0, value1: T1, value2: T2, value3: T3, value4: T4, value5: T5, value6: T6, value7: T7, value8: T8, value9: T9, value10: T10, value11: T11, value12: T12, value13: T13): Tuple14<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> = Tuple14(value0, value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13)
inline fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> tuple(value0: T0, value1: T1, value2: T2, value3: T3, value4: T4, value5: T5, value6: T6, value7: T7, value8: T8, value9: T9, value10: T10, value11: T11, value12: T12, value13: T13, value14: T14): Tuple15<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> = Tuple15(value0, value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14)
inline fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> tuple(value0: T0, value1: T1, value2: T2, value3: T3, value4: T4, value5: T5, value6: T6, value7: T7, value8: T8, value9: T9, value10: T10, value11: T11, value12: T12, value13: T13, value14: T14, value15: T15): Tuple16<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> = Tuple16(value0, value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15)
inline fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> tuple(value0: T0, value1: T1, value2: T2, value3: T3, value4: T4, value5: T5, value6: T6, value7: T7, value8: T8, value9: T9, value10: T10, value11: T11, value12: T12, value13: T13, value14: T14, value15: T15, value16: T16): Tuple17<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> = Tuple17(value0, value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16)
inline fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> tuple(value0: T0, value1: T1, value2: T2, value3: T3, value4: T4, value5: T5, value6: T6, value7: T7, value8: T8, value9: T9, value10: T10, value11: T11, value12: T12, value13: T13, value14: T14, value15: T15, value16: T16, value17: T17): Tuple18<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17> = Tuple18(value0, value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17)
inline fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> tuple(value0: T0, value1: T1, value2: T2, value3: T3, value4: T4, value5: T5, value6: T6, value7: T7, value8: T8, value9: T9, value10: T10, value11: T11, value12: T12, value13: T13, value14: T14, value15: T15, value16: T16, value17: T17, value18: T18): Tuple19<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18> = Tuple19(value0, value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18)
inline fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> tuple(value0: T0, value1: T1, value2: T2, value3: T3, value4: T4, value5: T5, value6: T6, value7: T7, value8: T8, value9: T9, value10: T10, value11: T11, value12: T12, value13: T13, value14: T14, value15: T15, value16: T16, value17: T17, value18: T18, value19: T19): Tuple20<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> = Tuple20(value0, value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18, value19)
inline fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> tuple(value0: T0, value1: T1, value2: T2, value3: T3, value4: T4, value5: T5, value6: T6, value7: T7, value8: T8, value9: T9, value10: T10, value11: T11, value12: T12, value13: T13, value14: T14, value15: T15, value16: T16, value17: T17, value18: T18, value19: T19, value20: T20): Tuple21<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> = Tuple21(value0, value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18, value19, value20)
inline fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> tuple(value0: T0, value1: T1, value2: T2, value3: T3, value4: T4, value5: T5, value6: T6, value7: T7, value8: T8, value9: T9, value10: T10, value11: T11, value12: T12, value13: T13, value14: T14, value15: T15, value16: T16, value17: T17, value18: T18, value19: T19, value20: T20, value21: T21): Tuple22<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21> = Tuple22(value0, value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18, value19, value20, value21)
inline fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> tuple(value0: T0, value1: T1, value2: T2, value3: T3, value4: T4, value5: T5, value6: T6, value7: T7, value8: T8, value9: T9, value10: T10, value11: T11, value12: T12, value13: T13, value14: T14, value15: T15, value16: T16, value17: T17, value18: T18, value19: T19, value20: T20, value21: T21, value22: T22): Tuple23<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22> = Tuple23(value0, value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18, value19, value20, value21, value22)
inline fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> tuple(value0: T0, value1: T1, value2: T2, value3: T3, value4: T4, value5: T5, value6: T6, value7: T7, value8: T8, value9: T9, value10: T10, value11: T11, value12: T12, value13: T13, value14: T14, value15: T15, value16: T16, value17: T17, value18: T18, value19: T19, value20: T20, value21: T21, value22: T22, value23: T23): Tuple24<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23> = Tuple24(value0, value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18, value19, value20, value21, value22, value23)
inline fun <T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> tuple(value0: T0, value1: T1, value2: T2, value3: T3, value4: T4, value5: T5, value6: T6, value7: T7, value8: T8, value9: T9, value10: T10, value11: T11, value12: T12, value13: T13, value14: T14, value15: T15, value16: T16, value17: T17, value18: T18, value19: T19, value20: T20, value21: T21, value22: T22, value23: T23, value24: T24): Tuple25<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24> = Tuple25(value0, value1, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, value14, value15, value16, value17, value18, value19, value20, value21, value22, value23, value24)

inline fun <T0> T0.toTuple1(): Tuple1<T0> = tuple(this)
inline fun <T0, T1> Pair<T0, T1>.toTuple(): Tuple2<T0, T1> = tuple(first, second)
inline fun <T0, T1, T2> Triple<T0, T1, T2>.toTuple(): Tuple3<T0, T1, T2> = tuple(first, second, third)
inline fun <T0, T1> Tuple2<T0, T1>.toPair(): Pair<T0, T1> = Pair(f0, f1)
inline fun <T0, T1, T2> Tuple3<T0, T1, T2>.toTriple(): Triple<T0, T1, T2> = Triple(f0, f1, f2)