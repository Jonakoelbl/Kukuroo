/**
 */
package org.miniGobstones.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.miniGobstones.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MiniGobstonesFactoryImpl extends EFactoryImpl implements MiniGobstonesFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MiniGobstonesFactory init()
  {
    try
    {
      MiniGobstonesFactory theMiniGobstonesFactory = (MiniGobstonesFactory)EPackage.Registry.INSTANCE.getEFactory(MiniGobstonesPackage.eNS_URI);
      if (theMiniGobstonesFactory != null)
      {
        return theMiniGobstonesFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MiniGobstonesFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MiniGobstonesFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MiniGobstonesPackage.MODEL: return createModel();
      case MiniGobstonesPackage.PROCEDURE: return createProcedure();
      case MiniGobstonesPackage.COMMAND: return createCommand();
      case MiniGobstonesPackage.PONER_N: return createPonerN();
      case MiniGobstonesPackage.MOVER_N: return createMoverN();
      case MiniGobstonesPackage.PONER: return createPoner();
      case MiniGobstonesPackage.MOVER: return createMover();
      case MiniGobstonesPackage.HAY_BOLITAS: return createHayBolitas();
      case MiniGobstonesPackage.PUEDE_MOVER: return createPuedeMover();
      case MiniGobstonesPackage.VARIABLE: return createVariable();
      case MiniGobstonesPackage.WHILE: return createWhile();
      case MiniGobstonesPackage.FOR: return createFor();
      case MiniGobstonesPackage.IF: return createIf();
      case MiniGobstonesPackage.EXPRESSION: return createExpression();
      case MiniGobstonesPackage.BOOLEANS: return createBooleans();
      case MiniGobstonesPackage.OPERATOR: return createOperator();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MiniGobstonesPackage.COLOR:
        return createColorFromString(eDataType, initialValue);
      case MiniGobstonesPackage.DIRECCION:
        return createDireccionFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MiniGobstonesPackage.COLOR:
        return convertColorToString(eDataType, instanceValue);
      case MiniGobstonesPackage.DIRECCION:
        return convertDireccionToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Procedure createProcedure()
  {
    ProcedureImpl procedure = new ProcedureImpl();
    return procedure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Command createCommand()
  {
    CommandImpl command = new CommandImpl();
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PonerN createPonerN()
  {
    PonerNImpl ponerN = new PonerNImpl();
    return ponerN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MoverN createMoverN()
  {
    MoverNImpl moverN = new MoverNImpl();
    return moverN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Poner createPoner()
  {
    PonerImpl poner = new PonerImpl();
    return poner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mover createMover()
  {
    MoverImpl mover = new MoverImpl();
    return mover;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HayBolitas createHayBolitas()
  {
    HayBolitasImpl hayBolitas = new HayBolitasImpl();
    return hayBolitas;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PuedeMover createPuedeMover()
  {
    PuedeMoverImpl puedeMover = new PuedeMoverImpl();
    return puedeMover;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public While createWhile()
  {
    WhileImpl while_ = new WhileImpl();
    return while_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public For createFor()
  {
    ForImpl for_ = new ForImpl();
    return for_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public If createIf()
  {
    IfImpl if_ = new IfImpl();
    return if_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Booleans createBooleans()
  {
    BooleansImpl booleans = new BooleansImpl();
    return booleans;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operator createOperator()
  {
    OperatorImpl operator = new OperatorImpl();
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color createColorFromString(EDataType eDataType, String initialValue)
  {
    Color result = Color.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertColorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Direccion createDireccionFromString(EDataType eDataType, String initialValue)
  {
    Direccion result = Direccion.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDireccionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MiniGobstonesPackage getMiniGobstonesPackage()
  {
    return (MiniGobstonesPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MiniGobstonesPackage getPackage()
  {
    return MiniGobstonesPackage.eINSTANCE;
  }

} //MiniGobstonesFactoryImpl
