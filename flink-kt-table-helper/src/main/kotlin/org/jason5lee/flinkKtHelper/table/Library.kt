@file:Suppress("NOTHING_TO_INLINE")

package org.jason5lee.flinkKtHelper.table

import org.apache.flink.table.api.ApiExpression
import org.apache.flink.table.api.Expressions
import org.apache.flink.table.types.DataType

/**
 * Creates a SQL literal.
 *
 * <p>The data type is derived from the object's class and its value.
 *
 * <p>For example:
 * <ul>
 *     <li>{@code lit(12)} leads to {@code INT}</li>
 *     <li>{@code lit("abc")} leads to {@code CHAR(3)}</li>
 *     <li>{@code lit(new BigDecimal("123.45"))} leads to {@code DECIMAL(5, 2)}</li>
 * </ul>
 *
 * <p>See {@link ValueDataTypeConverter} for a list of supported literal values.
 */
inline fun Any.lit(): ApiExpression = Expressions.lit(this)

/**
 * Creates a SQL literal of a given {@link DataType}.
 *
 * <p>The method {@link Any.lit()} is preferred as it extracts the {@link DataType} automatically.
 * Use this method only when necessary. The class of {@code this} must be supported according to the
 * {@link org.apache.flink.table.types.logical.LogicalType#supportsInputConversion(Class)}.
 */
inline fun Any.litAs(dataType: DataType): ApiExpression = Expressions.lit(this, dataType)

/**
 * Creates an unresolved reference to a table's field.
 *
 * <p>Example:
 * <pre>{@code
 *   tab.select(fld("key"), fld("value"))
 * }
 * </pre>
 */
inline fun fld(name: String): ApiExpression = Expressions.`$`(name)

/**
 * Using [this] as an unresolved reference to a table's field.
 *
 * <p>Example:
 * <pre>{@code
 *   tab.select("key".asField(), "value".asField())
 * }
 * </pre>
 */
inline fun String.asField(): ApiExpression = Expressions.`$`(this)