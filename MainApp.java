// Copyright Eric Chauvin 2019 - 2024.



// AI News Project.

// "\\AINewsData\\URLFiles\\"



import javax.swing.SwingUtilities;



class MainApp implements Runnable
  {
  public static final String versionDate =
                              "1/4/2024";
  private MainWindow mainWin;
  // public ConfigureFile mainConfigFile;
  private String[] argsArray;
  private StrA programDirectory;



  public static void main( String[] args )
    {
    MainApp mApp = new MainApp( args );
    SwingUtilities.invokeLater( mApp );
    }



  @Override
  public void run()
    {
    setupProgram();
    }



  private MainApp()
    {
    }


  public MainApp( String[] args )
    {
    argsArray = args;
    }



  private void setupProgram()
    {
    // checkSingleInstance()

     // All programs need to have a batch file give
    // it the program directory so they're not stuck
    // in that directory.
    // programDirectory = new StrA(
    //                 "\\EricMain\\Language" );

    // int length = argsArray.length;
    // if( length > 0 )
      // programDirectory = new StrA( argsArray[0] );

/*
    String mainConfigFileName = programDirectory +
                                      "MainConfigure.txt";

    mainConfigFile = new ConfigureFile( this,
                                mainConfigFileName );
    */

    mainWin = new MainWindow( this, "AI News" );
    mainWin.initialize();

    /*
    showStatus( " " );
    showStatus( "argsArray length: " + length );
    for( int count = 0; count < length; count++ )
      showStatus( argsArray[count] );
    */

    // showStatus( " " );
    }



  public void showStatusAsync( String toShow )
    {
    if( mainWin == null )
      return;

    mainWin.showStatusAsync( toShow );
    }



  public void clearStatus()
    {
    if( mainWin == null )
      return;

    mainWin.clearStatus();
    }




  }
