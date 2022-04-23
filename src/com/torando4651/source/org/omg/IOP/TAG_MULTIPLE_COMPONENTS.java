package org.omg.IOP;


/**
* org/omg/IOP/TAG_MULTIPLE_COMPONENTS.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /jenkins/workspace/8-2-build-macosx-x86_64/jdk8u261/295/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Thursday, June 18, 2020 6:39:17 AM GMT
*/

public interface TAG_MULTIPLE_COMPONENTS
{

  /** 
       * Indicates that the value encapsulated is of type 
       * <code>MultipleComponentProfile</code>. In this case, the profile 
       * consists of a list of protocol components, the use of which must 
       * be specified by the protocol using this profile. This profile may 
       * be used to carry IOR components.  
       * <p>
       * The <code>profile_data</code> for the 
       * <code>TAG_MULTIPLE_COMPONENTS</code> profile is a CDR encapsulation 
       * of the <code>MultipleComponentProfile</code> type shown above.
       */
  public static final int value = (int)(1L);
}
