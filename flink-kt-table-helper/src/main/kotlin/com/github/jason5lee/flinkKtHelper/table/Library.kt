@file:Suppress("NOTHING_TO_INLINE")

package com.github.jason5lee.flinkKtHelper.table

import org.apache.flink.table.api.ApiExpression
import org.apache.flink.table.api.Expressions
import org.apache.flink.table.types.DataType

/**
 * Creates a SQL literal.
 *
 * The data type is derived from the object's class and its value.
 *
 * For example:
 * * `12.lit()` leads to `INT`
 * * `"abc".lit()` leads to `CHAR(3)`
 * * `BigDecimal("123.45").lit()` leads to `DECIMAL(5, 2)`
 *
 * See [org.apache.flink.table.types.utils.ValueDataTypeConverter] for a list of supported literal values.
 */
inline fun Any.lit(): ApiExpression = Expressions.lit(this)

/**
 * Creates a SQL literal of a given [DataType].
 *
 * The extension method [lit] is preferred as it extracts the [DataType] automatically.
 * Use this method only when necessary. The class of [this] must be supported according to the
 * [org.apache.flink.table.types.logical.LogicalType.supportsInputConversion].
 */
inline fun Any.litAs(dataType: DataType): ApiExpression = Expressions.lit(this, dataType)

/**
 * Creates an unresolved reference to a table's field.
 *
 * Example:
 *
 * ```
 * tab.select(fld("key"), fld("value"))
 * ```
 */
inline fun fld(name: String): ApiExpression = Expressions.`$`(name)

/**
 * Using [this] as an unresolved reference to a table's field.
 *
 * Example:
 *
 * ```
 * tab.select("key".asField(), "value".asField())
 * ```
 */
inline fun String.asField(): ApiExpression = Expressions.`$`(this)