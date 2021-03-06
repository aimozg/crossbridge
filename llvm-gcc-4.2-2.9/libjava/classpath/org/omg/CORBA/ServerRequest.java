/* ServerRequest.java --
   Copyright (C) 2005 Free Software Foundation, Inc.

This file is part of GNU Classpath.

GNU Classpath is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

GNU Classpath is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with GNU Classpath; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
02110-1301 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */


package org.omg.CORBA;

/**
 * This class was expected to be part of the dynamic skeleton interface,
 * but it is almost never used in the code, generated by IDL to java compiler.
 * The recent tendention is to skip the request step, reading the method
 * arguments from the CDR input stream directly. The supplementing class
 * {@link DynamicImplementation} has already been deprecated in java 1.2
 * version.
 *
 * @author Audrius Meskauskas, Lithuania (AudriusA@Bioinformatics.org)
 */
public abstract class ServerRequest
{
  /**
   * Get the context information.
   */
  public abstract Context ctx();

  /**
   * Should return the name of the operation (method) being invoked.
   * Following the 1.4 specification, it does not, and must be overridden to
   * get functionality.
   *
   * @return the name of the operation being invoked. The object attribute
   * access operations are called _get_&lt;attribute_name&gt;
   * and _set_&lt;attribute_name&gt;.
   *
   * @throws NO_IMPLEMENT, always.
   */
  public String operation()
  {
    throw new NO_IMPLEMENT();
  }

  /**
   * Should specify the method parameter types and retrieve the
   * values that must be passed to the method being called. Following
   * the 1.4 specification, it does not, and must be overridden to
   * get functionality.
   *
   * @param args the method parameters.
   *
   * @throws NO_IMPLEMENT, always.
   */
  public void arguments(NVList args)
  {
    throw new NO_IMPLEMENT();
  }

  /**
   * Should specify the return value for the call. Following
   * the 1.4 specification, it does not, and must be overridden to
   * get functionality.
   *
   * @param result the return value.
   *
   * @throws NO_IMPLEMENT, always.
   */
  public void set_result(Any result)
  {
    throw new NO_IMPLEMENT();
  }

  /**
   * Should set the exception that has been thrown during
   * the method invocation. Following the 1.4 specification, it does not,
   * and must be overridden to get functionality.
   *
   * @param exc the Any, holding the exception.
   *
   * @throws NO_IMPLEMENT, always.
   */
  public void set_exception(Any exc)
  {
    throw new NO_IMPLEMENT();
  }

  /**
   * This method is deprecated, {@link #set_result} (same parameter).
   *
   * @deprecated since 1.2
   *
   * @throws NO_IMPLEMENT, always.
   */
  public void result(Any r)
  {
    throw new NO_IMPLEMENT();
  }

  /**
   * This method is deprecated, use {@link #set_exception} (same parameter).
   *
   * @deprecated since 1.2.
   *
   * @throws NO_IMPLEMENT, always.
   */
  public void except(Any exc)
  {
    throw new NO_IMPLEMENT();
  }

  /**
   * This method is deprecated, use {@link #arguments} (same parameter).
   *
   * @deprecated since 1.2
   *
   * @throws NO_IMPLEMENT, always.
   */
  public void params(NVList args)
  {
    throw new NO_IMPLEMENT();
  }

  /**
   * This method is deprecated, use {@link #operation} (same parameter).
   *
   * @deprecated since 1.2
   *
   * @throws NO_IMPLEMENT, always.
   */
  public String op_name()
  {
    throw new NO_IMPLEMENT();
  }
}
