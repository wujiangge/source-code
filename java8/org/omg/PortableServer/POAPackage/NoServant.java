package org.omg.PortableServer.POAPackage;


/**
* org/omg/PortableServer/POAPackage/NoServant.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON/workspace/8-2-build-linux-amd64/jdk8u171/10807/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Wednesday, March 28, 2018 5:07:46 PM PDT
*/

public final class NoServant extends org.omg.CORBA.UserException
{

  public NoServant ()
  {
    super(NoServantHelper.id());
  } // ctor


  public NoServant (String $reason)
  {
    super(NoServantHelper.id() + "  " + $reason);
  } // ctor

} // class NoServant
