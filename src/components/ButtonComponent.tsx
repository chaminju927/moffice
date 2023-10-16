import Button from "@mui/material/Button";
import { createTheme, ThemeProvider } from "@mui/material/styles";
import { useCallback, useMemo, useState } from "react";

function ButtonComponent({
  searchTable,
  btnName,
  icon,
}: //selectedRowData,
{
  searchTable?: () => void;
  btnName: string;
  icon?: any;
  //selectedRowData?: any;
}): JSX.Element {
  const mainTheme = createTheme({
    palette: {
      primary: {
        main: "#363a54",
        contrastText: "#fff",
      },
    },
    typography: {
      fontSize: 12,
    },
  });

  const roundTheme = createTheme({
    palette: {
      primary: {
        main: "#00c0aa",
        contrastText: "#fff",
      },
    },
    typography: {
      fontSize: 12,
    },
  });

  // useMemo - 단순 연산
  // useCallback - 함수
  // 내부에 state 값이나 props 값 등이 들어갈때 사용

  // const Select = useCallback(() => {
  //   searchTable?.(); //optional chaining
  //   //console.log(selectedRowData);
  // }, [searchTable]);

  if (btnName === "선택") {
    return (
      <div>
        <ThemeProvider theme={mainTheme}>
          <Button
            className="Button"
            size="medium"
            color="primary"
            variant="outlined"
            startIcon={icon}
            onClick={searchTable}
          >
            {btnName}
          </Button>
        </ThemeProvider>
      </div>
    );
  } else if (btnName === "출장신청") {
    return (
      <div>
        <ThemeProvider theme={roundTheme}>
          <Button
            size="medium"
            className="buttonText"
            color="primary"
            variant="contained"
            startIcon={icon}
            sx={{
              borderRadius: 20,
              height: 30,
            }}
          >
            {btnName}
          </Button>
        </ThemeProvider>
      </div>
    );
  } else {
    return (
      <div>
        <ThemeProvider theme={mainTheme}>
          <Button
            size="medium"
            color="primary"
            variant="contained"
            startIcon={icon}
            onClick={searchTable}
          >
            {btnName}
          </Button>
        </ThemeProvider>
      </div>
    );
  }
}
export default ButtonComponent;
