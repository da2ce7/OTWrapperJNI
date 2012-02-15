/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ot.wrapper.jni;

public class BitcoinAcct extends Acct {
  private long swigCPtr;

  public BitcoinAcct(long cPtr, boolean cMemoryOwn) {
    super(otapiJNI.BitcoinAcct_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(BitcoinAcct obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        otapiJNI.delete_BitcoinAcct(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }
/*@SWIG:OTAPI.i,379,OT_CAN_BE_CONTAINED_BY@*/
	// Ensure that the GC doesn't collect any OT_CONTAINER instance set from Java
	private WalletData containerRefWalletData;
	// ----------------	
	protected void addReference(WalletData theContainer) {  // This is Java code
		containerRefWalletData = theContainer;
	}
	// ----------------
/*@SWIG@*/
	// ------------------------
  public void setGui_label(String value) {
    otapiJNI.BitcoinAcct_gui_label_set(swigCPtr, this, value);
  }

  public String getGui_label() {
    return otapiJNI.BitcoinAcct_gui_label_get(swigCPtr, this);
  }

  public void setAcct_id(String value) {
    otapiJNI.BitcoinAcct_acct_id_set(swigCPtr, this, value);
  }

  public String getAcct_id() {
    return otapiJNI.BitcoinAcct_acct_id_get(swigCPtr, this);
  }

  public void setServer_id(String value) {
    otapiJNI.BitcoinAcct_server_id_set(swigCPtr, this, value);
  }

  public String getServer_id() {
    return otapiJNI.BitcoinAcct_server_id_get(swigCPtr, this);
  }

  public void setBitcoin_acct_name(String value) {
    otapiJNI.BitcoinAcct_bitcoin_acct_name_set(swigCPtr, this, value);
  }

  public String getBitcoin_acct_name() {
    return otapiJNI.BitcoinAcct_bitcoin_acct_name_get(swigCPtr, this);
  }

  public static BitcoinAcct ot_dynamic_cast(Storable pObject) {
    long cPtr = otapiJNI.BitcoinAcct_ot_dynamic_cast(Storable.getCPtr(pObject), pObject);
    return (cPtr == 0) ? null : new BitcoinAcct(cPtr, false);
  }

}
