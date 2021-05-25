/**
 * Autogenerated by Avro
 * <p>
 * DO NOT EDIT DIRECTLY
 */
package com.pj.cqrs.kafkastream.model;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;

@org.apache.avro.specific.AvroGenerated
public class Order extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord
{
	public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Order\",\"namespace\":\"com.kafkastream.model\",\"fields\":[{\"name\":\"orderId\",\"type\":\"string\"},{\"name\":\"customerId\",\"type\":\"string\"},{\"name\":\"orderItemName\",\"type\":\"string\"},{\"name\":\"orderPlace\",\"type\":\"string\"},{\"name\":\"orderPurchaseTime\",\"type\":\"string\"}]}");
	private static final long serialVersionUID = 6817749232838322839L;
	private static final SpecificData MODEL$ = new SpecificData();
	private static final BinaryMessageEncoder<Order> ENCODER =
			new BinaryMessageEncoder<Order>(MODEL$, SCHEMA$);
	private static final BinaryMessageDecoder<Order> DECODER =
			new BinaryMessageDecoder<Order>(MODEL$, SCHEMA$);
	@SuppressWarnings("unchecked")
	private static final org.apache.avro.io.DatumWriter<Order>
			WRITER$ = (org.apache.avro.io.DatumWriter<Order>) MODEL$.createDatumWriter(SCHEMA$);
	@SuppressWarnings("unchecked")
	private static final org.apache.avro.io.DatumReader<Order>
			READER$ = (org.apache.avro.io.DatumReader<Order>) MODEL$.createDatumReader(SCHEMA$);
	@Deprecated
	public java.lang.CharSequence orderId;
	@Deprecated
	public java.lang.CharSequence customerId;
	@Deprecated
	public java.lang.CharSequence orderItemName;
	@Deprecated
	public java.lang.CharSequence orderPlace;
	@Deprecated
	public java.lang.CharSequence orderPurchaseTime;
	/**
	 * Default constructor.  Note that this does not initialize fields
	 * to their default values from the schema.  If that is desired then
	 * one should use <code>newBuilder()</code>.
	 */
	public Order()
	{
	}
	/**
	 * All-args constructor.
	 * @param orderId The new value for orderId
	 * @param customerId The new value for customerId
	 * @param orderItemName The new value for orderItemName
	 * @param orderPlace The new value for orderPlace
	 * @param orderPurchaseTime The new value for orderPurchaseTime
	 */
	public Order(java.lang.CharSequence orderId, java.lang.CharSequence customerId, java.lang.CharSequence orderItemName, java.lang.CharSequence orderPlace, java.lang.CharSequence orderPurchaseTime)
	{
		this.orderId = orderId;
		this.customerId = customerId;
		this.orderItemName = orderItemName;
		this.orderPlace = orderPlace;
		this.orderPurchaseTime = orderPurchaseTime;
	}

	public static org.apache.avro.Schema getClassSchema()
	{
		return SCHEMA$;
	}

	/**
	 * Return the BinaryMessageEncoder instance used by this class.
	 * @return the message encoder used by this class
	 */
	public static BinaryMessageEncoder<Order> getEncoder()
	{
		return ENCODER;
	}

	/**
	 * Return the BinaryMessageDecoder instance used by this class.
	 * @return the message decoder used by this class
	 */
	public static BinaryMessageDecoder<Order> getDecoder()
	{
		return DECODER;
	}

	/**
	 * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
	 * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
	 * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
	 */
	public static BinaryMessageDecoder<Order> createDecoder(SchemaStore resolver)
	{
		return new BinaryMessageDecoder<Order>(MODEL$, SCHEMA$, resolver);
	}

	/**
	 * Deserializes a Order from a ByteBuffer.
	 * @param b a byte buffer holding serialized data for an instance of this class
	 * @return a Order instance decoded from the given buffer
	 * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
	 */
	public static Order fromByteBuffer(
			java.nio.ByteBuffer b) throws java.io.IOException
	{
		return DECODER.decode(b);
	}

	/**
	 * Creates a new Order RecordBuilder.
	 * @return A new Order RecordBuilder
	 */
	public static Order.Builder newBuilder()
	{
		return new Order.Builder();
	}

	/**
	 * Creates a new Order RecordBuilder by copying an existing Builder.
	 * @param other The existing builder to copy.
	 * @return A new Order RecordBuilder
	 */
	public static Order.Builder newBuilder(Order.Builder other)
	{
		if (other == null)
		{
			return new Order.Builder();
		}
		else
		{
			return new Order.Builder(other);
		}
	}

	/**
	 * Creates a new Order RecordBuilder by copying an existing Order instance.
	 * @param other The existing instance to copy.
	 * @return A new Order RecordBuilder
	 */
	public static Order.Builder newBuilder(Order other)
	{
		if (other == null)
		{
			return new Order.Builder();
		}
		else
		{
			return new Order.Builder(other);
		}
	}

	/**
	 * Serializes this Order to a ByteBuffer.
	 * @return a buffer holding the serialized data for this instance
	 * @throws java.io.IOException if this instance could not be serialized
	 */
	public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException
	{
		return ENCODER.encode(this);
	}

	public org.apache.avro.Schema getSchema()
	{
		return SCHEMA$;
	}

	// Used by DatumWriter.  Applications should not call.
	public java.lang.Object get(int field$)
	{
		switch (field$)
		{
			case 0:
				return orderId;
			case 1:
				return customerId;
			case 2:
				return orderItemName;
			case 3:
				return orderPlace;
			case 4:
				return orderPurchaseTime;
			default:
				throw new org.apache.avro.AvroRuntimeException("Bad index");
		}
	}

	// Used by DatumReader.  Applications should not call.
	@SuppressWarnings(value = "unchecked")
	public void put(int field$, java.lang.Object value$)
	{
		switch (field$)
		{
			case 0:
				orderId = (java.lang.CharSequence) value$;
				break;
			case 1:
				customerId = (java.lang.CharSequence) value$;
				break;
			case 2:
				orderItemName = (java.lang.CharSequence) value$;
				break;
			case 3:
				orderPlace = (java.lang.CharSequence) value$;
				break;
			case 4:
				orderPurchaseTime = (java.lang.CharSequence) value$;
				break;
			default:
				throw new org.apache.avro.AvroRuntimeException("Bad index");
		}
	}

	public org.apache.avro.specific.SpecificData getSpecificData()
	{
		return MODEL$;
	}

	@Override
	public void writeExternal(java.io.ObjectOutput out)
			throws java.io.IOException
	{
		WRITER$.write(this, SpecificData.getEncoder(out));
	}

	@Override
	public void readExternal(java.io.ObjectInput in)
			throws java.io.IOException
	{
		READER$.read(this, SpecificData.getDecoder(in));
	}

	@Override
	protected boolean hasCustomCoders()
	{
		return true;
	}

	@Override
	public void customEncode(org.apache.avro.io.Encoder out)
			throws java.io.IOException
	{
		out.writeString(this.orderId);

		out.writeString(this.customerId);

		out.writeString(this.orderItemName);

		out.writeString(this.orderPlace);

		out.writeString(this.orderPurchaseTime);

	}

	@Override
	public void customDecode(org.apache.avro.io.ResolvingDecoder in)
			throws java.io.IOException
	{
		org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
		if (fieldOrder == null)
		{
			this.orderId = in.readString(this.orderId instanceof Utf8 ? (Utf8) this.orderId : null);

			this.customerId = in.readString(this.customerId instanceof Utf8 ? (Utf8) this.customerId : null);

			this.orderItemName = in.readString(this.orderItemName instanceof Utf8 ? (Utf8) this.orderItemName : null);

			this.orderPlace = in.readString(this.orderPlace instanceof Utf8 ? (Utf8) this.orderPlace : null);

			this.orderPurchaseTime = in.readString(this.orderPurchaseTime instanceof Utf8 ? (Utf8) this.orderPurchaseTime : null);

		}
		else
		{
			for (int i = 0; i < 5; i++)
			{
				switch (fieldOrder[i].pos())
				{
					case 0:
						this.orderId = in.readString(this.orderId instanceof Utf8 ? (Utf8) this.orderId : null);
						break;

					case 1:
						this.customerId = in.readString(this.customerId instanceof Utf8 ? (Utf8) this.customerId : null);
						break;

					case 2:
						this.orderItemName = in.readString(this.orderItemName instanceof Utf8 ? (Utf8) this.orderItemName : null);
						break;

					case 3:
						this.orderPlace = in.readString(this.orderPlace instanceof Utf8 ? (Utf8) this.orderPlace : null);
						break;

					case 4:
						this.orderPurchaseTime = in.readString(this.orderPurchaseTime instanceof Utf8 ? (Utf8) this.orderPurchaseTime : null);
						break;

					default:
						throw new java.io.IOException("Corrupt ResolvingDecoder.");
				}
			}
		}
	}

	/**
	 * Gets the value of the 'orderId' field.
	 * @return The value of the 'orderId' field.
	 */
	public java.lang.CharSequence getOrderId()
	{
		return orderId;
	}

	/**
	 * Sets the value of the 'orderId' field.
	 * @param value the value to set.
	 */
	public void setOrderId(java.lang.CharSequence value)
	{
		this.orderId = value;
	}

	/**
	 * Gets the value of the 'customerId' field.
	 * @return The value of the 'customerId' field.
	 */
	public java.lang.CharSequence getCustomerId()
	{
		return customerId;
	}

	/**
	 * Sets the value of the 'customerId' field.
	 * @param value the value to set.
	 */
	public void setCustomerId(java.lang.CharSequence value)
	{
		this.customerId = value;
	}

	/**
	 * Gets the value of the 'orderItemName' field.
	 * @return The value of the 'orderItemName' field.
	 */
	public java.lang.CharSequence getOrderItemName()
	{
		return orderItemName;
	}

	/**
	 * Sets the value of the 'orderItemName' field.
	 * @param value the value to set.
	 */
	public void setOrderItemName(java.lang.CharSequence value)
	{
		this.orderItemName = value;
	}

	/**
	 * Gets the value of the 'orderPlace' field.
	 * @return The value of the 'orderPlace' field.
	 */
	public java.lang.CharSequence getOrderPlace()
	{
		return orderPlace;
	}

	/**
	 * Sets the value of the 'orderPlace' field.
	 * @param value the value to set.
	 */
	public void setOrderPlace(java.lang.CharSequence value)
	{
		this.orderPlace = value;
	}

	/**
	 * Gets the value of the 'orderPurchaseTime' field.
	 * @return The value of the 'orderPurchaseTime' field.
	 */
	public java.lang.CharSequence getOrderPurchaseTime()
	{
		return orderPurchaseTime;
	}

	/**
	 * Sets the value of the 'orderPurchaseTime' field.
	 * @param value the value to set.
	 */
	public void setOrderPurchaseTime(java.lang.CharSequence value)
	{
		this.orderPurchaseTime = value;
	}

	/**
	 * RecordBuilder for Order instances.
	 */
	public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Order>
			implements org.apache.avro.data.RecordBuilder<Order>
	{

		private java.lang.CharSequence orderId;
		private java.lang.CharSequence customerId;
		private java.lang.CharSequence orderItemName;
		private java.lang.CharSequence orderPlace;
		private java.lang.CharSequence orderPurchaseTime;

		/** Creates a new Builder */
		private Builder()
		{
			super(SCHEMA$);
		}

		/**
		 * Creates a Builder by copying an existing Builder.
		 * @param other The existing Builder to copy.
		 */
		private Builder(Order.Builder other)
		{
			super(other);
			if (isValidValue(fields()[0], other.orderId))
			{
				this.orderId = data().deepCopy(fields()[0].schema(), other.orderId);
				fieldSetFlags()[0] = other.fieldSetFlags()[0];
			}
			if (isValidValue(fields()[1], other.customerId))
			{
				this.customerId = data().deepCopy(fields()[1].schema(), other.customerId);
				fieldSetFlags()[1] = other.fieldSetFlags()[1];
			}
			if (isValidValue(fields()[2], other.orderItemName))
			{
				this.orderItemName = data().deepCopy(fields()[2].schema(), other.orderItemName);
				fieldSetFlags()[2] = other.fieldSetFlags()[2];
			}
			if (isValidValue(fields()[3], other.orderPlace))
			{
				this.orderPlace = data().deepCopy(fields()[3].schema(), other.orderPlace);
				fieldSetFlags()[3] = other.fieldSetFlags()[3];
			}
			if (isValidValue(fields()[4], other.orderPurchaseTime))
			{
				this.orderPurchaseTime = data().deepCopy(fields()[4].schema(), other.orderPurchaseTime);
				fieldSetFlags()[4] = other.fieldSetFlags()[4];
			}
		}

		/**
		 * Creates a Builder by copying an existing Order instance
		 * @param other The existing instance to copy.
		 */
		private Builder(Order other)
		{
			super(SCHEMA$);
			if (isValidValue(fields()[0], other.orderId))
			{
				this.orderId = data().deepCopy(fields()[0].schema(), other.orderId);
				fieldSetFlags()[0] = true;
			}
			if (isValidValue(fields()[1], other.customerId))
			{
				this.customerId = data().deepCopy(fields()[1].schema(), other.customerId);
				fieldSetFlags()[1] = true;
			}
			if (isValidValue(fields()[2], other.orderItemName))
			{
				this.orderItemName = data().deepCopy(fields()[2].schema(), other.orderItemName);
				fieldSetFlags()[2] = true;
			}
			if (isValidValue(fields()[3], other.orderPlace))
			{
				this.orderPlace = data().deepCopy(fields()[3].schema(), other.orderPlace);
				fieldSetFlags()[3] = true;
			}
			if (isValidValue(fields()[4], other.orderPurchaseTime))
			{
				this.orderPurchaseTime = data().deepCopy(fields()[4].schema(), other.orderPurchaseTime);
				fieldSetFlags()[4] = true;
			}
		}

		/**
		 * Gets the value of the 'orderId' field.
		 * @return The value.
		 */
		public java.lang.CharSequence getOrderId()
		{
			return orderId;
		}


		/**
		 * Sets the value of the 'orderId' field.
		 * @param value The value of 'orderId'.
		 * @return This builder.
		 */
		public Order.Builder setOrderId(java.lang.CharSequence value)
		{
			validate(fields()[0], value);
			this.orderId = value;
			fieldSetFlags()[0] = true;
			return this;
		}

		/**
		 * Checks whether the 'orderId' field has been set.
		 * @return True if the 'orderId' field has been set, false otherwise.
		 */
		public boolean hasOrderId()
		{
			return fieldSetFlags()[0];
		}


		/**
		 * Clears the value of the 'orderId' field.
		 * @return This builder.
		 */
		public Order.Builder clearOrderId()
		{
			orderId = null;
			fieldSetFlags()[0] = false;
			return this;
		}

		/**
		 * Gets the value of the 'customerId' field.
		 * @return The value.
		 */
		public java.lang.CharSequence getCustomerId()
		{
			return customerId;
		}


		/**
		 * Sets the value of the 'customerId' field.
		 * @param value The value of 'customerId'.
		 * @return This builder.
		 */
		public Order.Builder setCustomerId(java.lang.CharSequence value)
		{
			validate(fields()[1], value);
			this.customerId = value;
			fieldSetFlags()[1] = true;
			return this;
		}

		/**
		 * Checks whether the 'customerId' field has been set.
		 * @return True if the 'customerId' field has been set, false otherwise.
		 */
		public boolean hasCustomerId()
		{
			return fieldSetFlags()[1];
		}


		/**
		 * Clears the value of the 'customerId' field.
		 * @return This builder.
		 */
		public Order.Builder clearCustomerId()
		{
			customerId = null;
			fieldSetFlags()[1] = false;
			return this;
		}

		/**
		 * Gets the value of the 'orderItemName' field.
		 * @return The value.
		 */
		public java.lang.CharSequence getOrderItemName()
		{
			return orderItemName;
		}


		/**
		 * Sets the value of the 'orderItemName' field.
		 * @param value The value of 'orderItemName'.
		 * @return This builder.
		 */
		public Order.Builder setOrderItemName(java.lang.CharSequence value)
		{
			validate(fields()[2], value);
			this.orderItemName = value;
			fieldSetFlags()[2] = true;
			return this;
		}

		/**
		 * Checks whether the 'orderItemName' field has been set.
		 * @return True if the 'orderItemName' field has been set, false otherwise.
		 */
		public boolean hasOrderItemName()
		{
			return fieldSetFlags()[2];
		}


		/**
		 * Clears the value of the 'orderItemName' field.
		 * @return This builder.
		 */
		public Order.Builder clearOrderItemName()
		{
			orderItemName = null;
			fieldSetFlags()[2] = false;
			return this;
		}

		/**
		 * Gets the value of the 'orderPlace' field.
		 * @return The value.
		 */
		public java.lang.CharSequence getOrderPlace()
		{
			return orderPlace;
		}


		/**
		 * Sets the value of the 'orderPlace' field.
		 * @param value The value of 'orderPlace'.
		 * @return This builder.
		 */
		public Order.Builder setOrderPlace(java.lang.CharSequence value)
		{
			validate(fields()[3], value);
			this.orderPlace = value;
			fieldSetFlags()[3] = true;
			return this;
		}

		/**
		 * Checks whether the 'orderPlace' field has been set.
		 * @return True if the 'orderPlace' field has been set, false otherwise.
		 */
		public boolean hasOrderPlace()
		{
			return fieldSetFlags()[3];
		}


		/**
		 * Clears the value of the 'orderPlace' field.
		 * @return This builder.
		 */
		public Order.Builder clearOrderPlace()
		{
			orderPlace = null;
			fieldSetFlags()[3] = false;
			return this;
		}

		/**
		 * Gets the value of the 'orderPurchaseTime' field.
		 * @return The value.
		 */
		public java.lang.CharSequence getOrderPurchaseTime()
		{
			return orderPurchaseTime;
		}


		/**
		 * Sets the value of the 'orderPurchaseTime' field.
		 * @param value The value of 'orderPurchaseTime'.
		 * @return This builder.
		 */
		public Order.Builder setOrderPurchaseTime(java.lang.CharSequence value)
		{
			validate(fields()[4], value);
			this.orderPurchaseTime = value;
			fieldSetFlags()[4] = true;
			return this;
		}

		/**
		 * Checks whether the 'orderPurchaseTime' field has been set.
		 * @return True if the 'orderPurchaseTime' field has been set, false otherwise.
		 */
		public boolean hasOrderPurchaseTime()
		{
			return fieldSetFlags()[4];
		}


		/**
		 * Clears the value of the 'orderPurchaseTime' field.
		 * @return This builder.
		 */
		public Order.Builder clearOrderPurchaseTime()
		{
			orderPurchaseTime = null;
			fieldSetFlags()[4] = false;
			return this;
		}

		@Override
		@SuppressWarnings("unchecked")
		public Order build()
		{
			try
			{
				Order record = new Order();
				record.orderId = fieldSetFlags()[0] ? this.orderId : (java.lang.CharSequence) defaultValue(fields()[0]);
				record.customerId = fieldSetFlags()[1] ? this.customerId : (java.lang.CharSequence) defaultValue(fields()[1]);
				record.orderItemName = fieldSetFlags()[2] ? this.orderItemName : (java.lang.CharSequence) defaultValue(fields()[2]);
				record.orderPlace = fieldSetFlags()[3] ? this.orderPlace : (java.lang.CharSequence) defaultValue(fields()[3]);
				record.orderPurchaseTime = fieldSetFlags()[4] ? this.orderPurchaseTime : (java.lang.CharSequence) defaultValue(fields()[4]);
				return record;
			}
			catch (org.apache.avro.AvroMissingFieldException e)
			{
				throw e;
			}
			catch (java.lang.Exception e)
			{
				throw new org.apache.avro.AvroRuntimeException(e);
			}
		}
	}
}










